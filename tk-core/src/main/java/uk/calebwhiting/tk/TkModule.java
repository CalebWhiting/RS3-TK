package uk.calebwhiting.tk;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import lombok.RequiredArgsConstructor;
import org.freedesktop.xcb.Xcb;
import org.freedesktop.xcb.XcbConnection;
import uk.calebwhiting.tk.annotations.EventHandler;
import uk.calebwhiting.tk.bus.EventBus;
import uk.calebwhiting.tk.event.Exiting;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
public class TkModule extends AbstractModule {

    private final App app;

    @Override
    protected void configure() {
        super.configure();

        XcbConnection connection = Xcb.connect(null);
        ExecutorService eventBusExecutor = Executors.newSingleThreadExecutor();
        EventBus eventBus = new EventBus(eventBusExecutor);

        this.bind(ExecutorService.class)
                .annotatedWith(Names.named("EventBusExecutor"))
                .toInstance(eventBusExecutor);

        this.bind(EventBus.class).toInstance(eventBus);
        this.bind(XcbConnection.class).toInstance(connection);
        this.bind(CaptureManager.class);
        this.bind(App.class).toInstance(this.app);

        /*eventBus.register(new Object() {
            @EventHandler
            public void shutdownEventBusService(Exiting evt) {
                System.out.println("Shutting down event bus service");
                eventBusExecutor.shutdown();
            }
        });*/
    }

}
