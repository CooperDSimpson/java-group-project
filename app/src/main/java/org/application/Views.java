package org.application;

import javafx.scene.Scene;
import java.util.HashMap;
import java.util.Map;

public final class Views {

    private static final Map<String, Scene> scenes = new HashMap<>();

    private Views() {
    }

    // adds a view (used in a new class in .views to set its name)
    public static void add(String name, Scene scene) {
        scenes.put(name, scene);
    }

    // sets current view
    public static void show(String name) {
        Scene scene = scenes.get(name);

        if (scene == null) {
            throw new RuntimeException("View not found: " + name);
        }

        State.stage.setScene(scene);
        State.stage.show();
    }

    // automatically finds views in the .views package and initializes them
    public static void init() {
        for (Class<?> clazz : ClassScanner.getClasses("org.application.views")) {
            try {
                clazz.getMethod("run").invoke(null);
            } catch (Exception e) {
                throw new RuntimeException(
                        "Failed to initialize " + clazz.getName(), e);
            }
        }
    }
}
