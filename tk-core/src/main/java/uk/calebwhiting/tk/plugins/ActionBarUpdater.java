package uk.calebwhiting.tk.plugins;

import com.google.common.eventbus.Subscribe;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import uk.calebwhiting.tk.annotations.EventHandler;
import uk.calebwhiting.tk.annotations.Plugin;
import uk.calebwhiting.tk.event.FrameCaptured;
import uk.calebwhiting.tk.event.Starting;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

@Plugin(name = "Action Bar Updater", version = 1.0)
public class ActionBarUpdater {

    public static final String KEY_ACTIONBAR_RECT = "ActionBar.Rect";

    private static final Scalar CYAN = new Scalar(0, 150, 255);

    private final List<Mat[]> actionBarTemplates = new LinkedList<>();

    @Subscribe
    public void onStarting(Starting evt) throws URISyntaxException {
        loadActionBarImage("primary-action-bar-1-template");
    }

    private void loadActionBarImage(String name) throws URISyntaxException {
        URL in = getClass().getResource("/uk/calebwhiting/tk/images/" + name + ".bmp");
        Mat mat = Imgcodecs.imread(new File(in.toURI()).getAbsolutePath(), Imgcodecs.IMREAD_UNCHANGED);
        Imgcodecs.imwrite(name + "-dump.bmp", mat);

        Mat mask = mat.clone();
        for (int row = 0; row < mat.rows(); row++) {
            for (int col = 0; col < mat.cols(); col++) {
                double[] c = mat.get(row, col);
                int a = c[0] == 255 && c[1] == 0 && c[2] == 255 ? 0 : 255;
                mask.put(row, col, a, a, a);
            }
        }
        Imgcodecs.imwrite(name + "-mask.bmp", mask);
        this.actionBarTemplates.add(new Mat[]{mat, mask});
    }

    @Subscribe
    @EventHandler
    public void onFrameCaptured(FrameCaptured evt) {
        Mat frame = evt.getFrame();
        if (frame.empty()) return;
        for (Mat[] templateMaskPair : this.actionBarTemplates) {
            Mat template = templateMaskPair[0];
            Mat mask = templateMaskPair[1];

            Mat result = new Mat();

            Imgproc.matchTemplate(frame, template, result, Imgproc.TM_CCORR_NORMED, mask);

            Core.MinMaxLocResult minMaxLoc = Core.minMaxLoc(result);
            if (minMaxLoc.maxVal >= 0.9) {
                Point pos = minMaxLoc.maxLoc;
                Rect rect = new Rect(pos, template.size());
                System.out.println("ActionBar: bounds=" + rect + ", match=" + minMaxLoc.maxVal);
                Imgproc.rectangle(frame, rect, CYAN, 2);
                evt.getContext().getVars().put(KEY_ACTIONBAR_RECT, rect);
            }
            result.release();
        }
    }

}
