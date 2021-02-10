package uk.calebwhiting.tk.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.function.Function;

public interface ClientContext {

    long getId();

    Map<Object, Object> getVars();

    default <Y> Y getDataStructure(Class<Y> cls) {
        return cls.cast(getVars().computeIfAbsent(cls, (Function<Object, Y>) key -> {
            try {
                Constructor<Y> constructor = cls.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (ReflectiveOperationException e) {
                e.printStackTrace();
                return null;
            }
        }));
    }

}
