package uk.calebwhiting.tk.plugins;

import com.google.common.eventbus.Subscribe;
import lombok.Getter;
import uk.calebwhiting.tk.annotations.Plugin;
import uk.calebwhiting.tk.color.*;
import uk.calebwhiting.tk.color.sample.XImageSample;
import uk.calebwhiting.tk.event.FrameCaptured;

import java.awt.*;

@Plugin(name = "Action Bar Updater", version = 1.0)
public class ActionBarUpdater {

    private static final Template[] ACTIONBAR_TEMPLATES = {
            new DistributedColorTemplate(0.9f,
                    new ColorMarker(0, 0, 0x4E5B66),
                    new ColorMarker(529, 0, 0x4E5B66),
                    new ColorMarker(529, 75, 0x3E4951),
                    new ColorMarker(0, 75, 0x3E4951)
            )
    };

    @Getter
    public static class ActionBarInfo {
        private int type = -1;
        private Rectangle bounds = null;
    }

    @Subscribe
    public void updateActionBarRect(FrameCaptured evt) {
        ActionBarInfo vars = evt.getContext().getDataStructure(ActionBarInfo.class);
        int previousIndex = vars.getType();
        if (previousIndex != -1) {
            Rectangle previousBounds = vars.getBounds();
            Sample sample = new XImageSample(evt.getImage(), previousBounds.x, previousBounds.y);
            if (ACTIONBAR_TEMPLATES[previousIndex].compare(sample) == 1f) {
                return;
            }
            vars.type = -1;
            vars.bounds = null;
        }
        Match m = null;
        for (int i = 0; i < ACTIONBAR_TEMPLATES.length; i++) {
            Template template = ACTIONBAR_TEMPLATES[i];
            Match[] matches = template.query(evt.getImage(), 1f);
            if (matches.length == 0)
                continue;
            if (matches.length > 1)
                System.err.println("ACTIONBAR_TEMPLATES[" + i + "] returned " + matches.length + " matches!");
            m = matches[0];
            vars.type = i;
            vars.bounds = new Rectangle(m.getPoint(), template.size());
            break;
        }

        if (m == null) {
            System.out.println("No match");
            return;
        }
        System.out.println("Match: " + m.getPoint() + ", " + m.getSimilarity());
    }

}
