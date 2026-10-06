package org.application;

import javafx.animation.AnimationTimer;

public final class MainLoop {

    private static AnimationTimer timer;

    private MainLoop() {
    }

    public static void start() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };

        timer.start();
    }

    public static void stop() {
        if (timer != null) {
            timer.stop();
        }
    }

    private static void update() {
        // Runs every JavaFX frame
    }
}
