package uk.calebwhiting.tk;

import com.google.common.eventbus.EventBus;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.Getter;
import org.opencv.osgi.OpenCVNativeLoader;
import uk.calebwhiting.tk.event.Exiting;
import uk.calebwhiting.tk.event.Starting;
import uk.calebwhiting.tk.inject.CaptureManager;
import uk.calebwhiting.tk.plugins.ActionBarUpdater;

import java.io.IOException;
import java.io.InputStream;

/**
 * This doesn't do anything yet, it's currently just a draggable icon
 */
public class App extends Application {

    private static final String ICON_RESOURCE = "/uk/calebwhiting/tk/images/3.png";
    private static final String BORDER_RESOURCE = "/com/runescape/images/border.png";
    private static final String CSS_RESOURCE = "/uk/calebwhiting/tk/css/app.css";
    private final Module module = new TkModule(this);
    private Injector injector;
    @Getter
    private Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setTitle("3TK");

        Image icon;
        try (InputStream in = getClass().getResourceAsStream(ICON_RESOURCE)) {
            icon = new Image(in);
        }

        Image border;
        try (InputStream in = getClass().getResourceAsStream(BORDER_RESOURCE)) {
            border = new Image(in);
        }

        stage.getIcons().add(icon);

        ImageView backgroundView = new ImageView(border);
        backgroundView.setFitWidth(48);
        backgroundView.setFitHeight(48);

        ImageView iconView = new ImageView(icon);
        iconView.setFitWidth(32);
        iconView.setFitHeight(32);
        iconView.setEffect(new DropShadow());

        StackPane button = new StackPane(backgroundView, iconView);
        button.setId("orb");

        Scene scene = new Scene(button, Color.TRANSPARENT);
        scene.getStylesheets().add(getClass().getResource(CSS_RESOURCE).toExternalForm());

        scene.addEventHandler(MouseEvent.ANY, new FloatingDragHandler(stage));

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.setAlwaysOnTop(true);

        stage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        new OpenCVNativeLoader().init();
        injector = Guice.createInjector(com.google.inject.Stage.DEVELOPMENT, module);
        EventBus eventBus = injector.getInstance(EventBus.class);

        Object[] plugins = {
                injector.getInstance(CaptureManager.class),
                new ActionBarUpdater()
        };

        for (Object plugin : plugins)
            eventBus.register(plugin);

        eventBus.post(new Starting());
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        if (injector != null) {
            EventBus bus = injector.getInstance(EventBus.class);
            bus.post(new Exiting());
        }
        if (this.stage != null) {
            this.stage.close();
        }
    }

    private static class FloatingDragHandler implements EventHandler<MouseEvent> {

        private final double[] start;
        private final Stage stage;

        public FloatingDragHandler(Stage stage) {
            this.stage = stage;
            this.start = new double[2];
        }

        @Override
        public void handle(MouseEvent event) {
            if (event.getEventType() == MouseEvent.MOUSE_PRESSED) {
                start[0] = event.getX();
                start[1] = event.getY();
            } else if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                stage.setX(event.getScreenX() - start[0]);
                stage.setY(event.getScreenY() - start[1]);
            }
        }
    }
}
