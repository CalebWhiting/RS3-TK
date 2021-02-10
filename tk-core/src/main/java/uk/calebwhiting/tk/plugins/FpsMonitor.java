package uk.calebwhiting.tk.plugins;

import com.google.common.eventbus.Subscribe;
import uk.calebwhiting.tk.annotations.Plugin;
import uk.calebwhiting.tk.api.ClientContext;
import uk.calebwhiting.tk.event.ClientEvent;
import uk.calebwhiting.tk.event.FrameCaptured;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Plugin(name = "FPS Monitor", version = 1.0)
public class FpsMonitor {

    private static class FpsInfo {
        public long averageFrameTime;
        public long averageFramesPerSecond;

        private int frameCount = 0;
        private long lastFrameTime = -1;
        private final long[] times = new long[10];
    }

    @Subscribe
    public void initFpsMonitor(ClientEvent evt) {
        if (evt.getId() == ClientEvent.CLIENT_WINDOW_ADDED) {
            ClientContext ctx = evt.getContext();
            FpsInfo data = ctx.getDataStructure(FpsInfo.class);
            Arrays.fill(data.times, -1);
        }
    }

    @Subscribe
    public void computeFramesPerSecond(FrameCaptured evt) {
        ClientContext ctx = evt.getContext();
        FpsInfo data = ctx.getDataStructure(FpsInfo.class);
        long now = System.currentTimeMillis();

        if (data.lastFrameTime == -1) {
            data.lastFrameTime = now;
            return;
        }

        long elapsed = (now - data.lastFrameTime);
        data.times[data.frameCount % 10] = elapsed;

        long sum = 0L;
        for (int i = 0; i < Math.min(data.frameCount, data.times.length); i++) {
            sum += data.times[i];
        }

        if (data.frameCount > 0) {
            long avg = sum / Math.min(data.frameCount, data.times.length);
            data.averageFrameTime = avg;
            data.averageFramesPerSecond = (1000L / avg);
        }

        if (data.frameCount > 0 && data.frameCount % 100 == 0) {
            System.out.println("FPS: " + data.averageFramesPerSecond + ", " +
                    LongStream.of(data.times).mapToObj(x -> x + "ms").collect(Collectors.joining(", ", "times[", "]")));
        }

        data.lastFrameTime = now;
        data.frameCount++;
    }

}
