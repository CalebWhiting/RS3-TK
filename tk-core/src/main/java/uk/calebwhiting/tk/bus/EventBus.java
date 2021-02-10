package uk.calebwhiting.tk.bus;

import com.google.common.eventbus.Subscribe;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.calebwhiting.tk.annotations.Destructor;
import uk.calebwhiting.tk.annotations.EventHandler;
import uk.calebwhiting.tk.annotations.Initializer;
import uk.calebwhiting.tk.event.Exiting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.concurrent.*;

/**
 * A bad implementation of a semi-asynchronous event-bus.
 *
 * With this implementation handlers are multi-threaded, however the dispatch method will wait
 * for all of the handlers to finish execution before returning.
 */
public class EventBus {

    @Getter
    private final ExecutorService executorService;

    private final Map<Class<?>, Set<Callback>> callbacks = new HashMap<>();
    private final Map<Class<?>, Set<Method>> initializers = new LinkedHashMap<>();
    private final Map<Class<?>, Set<Method>> destructors = new LinkedHashMap<>();
    private boolean rejectEvents = false;

    public EventBus(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void register(Object o) {
        synchronized (callbacks) {
            Stack<Class<?>> stack = new Stack<>();
            stack.push(o.getClass());
            while (stack.size() > 0) {
                Class<?> c = stack.pop();
                Method[] methods = c.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(EventHandler.class) || method.isAnnotationPresent(Subscribe.class)) {
                        if (method.getReturnType() != void.class) continue;
                        if (method.getParameterCount() != 1) continue;
                        method.setAccessible(true);
                        Parameter param = method.getParameters()[0];
                        Set<Callback> callbacks = this.callbacks.computeIfAbsent(param.getType(), x -> new LinkedHashSet<>());
                        callbacks.add(new Callback(o, c, method));
                    } else if (method.isAnnotationPresent(Initializer.class)) {
                        method.setAccessible(true);
                        Set<Method> initializers = this.initializers.computeIfAbsent(c, x -> new LinkedHashSet<>());
                        initializers.add(method);
                    } else if (method.isAnnotationPresent(Destructor.class)) {
                        method.setAccessible(true);
                        Set<Method> destructors = this.destructors.computeIfAbsent(c, x -> new LinkedHashSet<>());
                        destructors.add(method);
                    }
                }
                Collections.addAll(stack, c.getInterfaces());
                if (c.getSuperclass() != null)
                    stack.push(c.getSuperclass());
            }
        }
        call(this.initializers, o);
    }

    public void resign(Object o) {
        synchronized (callbacks) {
            this.callbacks.forEach((k, v) -> v.removeIf(c -> c.instance == o));
        }
        call(this.destructors, o);
    }

    public void dispatch(Object o) {
        if (this.executorService.isShutdown() || this.rejectEvents) {
            return;
        }
        Set<Future<?>> futures = new HashSet<>();
        synchronized (callbacks) {
            Stack<Class<?>> stack = new Stack<>();
            stack.push(o.getClass());
            while (stack.size() > 0) {
                Class<?> c = stack.pop();
                Set<Callback> callbacks = this.callbacks.get(c);
                if (callbacks != null) {
                    for (Callback callback : callbacks) {
                        Future<?> future = this.executorService.submit(
                                () -> call(callback.method, callback.instance, o));
                        futures.add(future);
                    }
                }
                Collections.addAll(stack, c.getInterfaces());
                if (c.getSuperclass() != null)
                    stack.push(c.getSuperclass());
            }
        }
        for (Future<?> future : futures) {
            try {
                future.get();
            } catch (InterruptedException ignore) {
                break;
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private void call(Map<Class<?>, Set<Method>> methods, Object o, Object... args) {
        for (Class<?> c : methods.keySet()) {
            if (c.isInstance(o)) {
                for (Method m : methods.get(c)) {
                    try {
                        m.invoke(o, m, args);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void call(Method method, Object instance, Object... args) {
        try {
            method.invoke(instance, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        this.dispatch(new Exiting());
        this.rejectEvents = true;
        this.getExecutorService().shutdown();
    }

    @EqualsAndHashCode
    @RequiredArgsConstructor
    private static class Callback {
        private final Object instance;
        private final Class<?> clazz;
        private final Method method;
    }

}
