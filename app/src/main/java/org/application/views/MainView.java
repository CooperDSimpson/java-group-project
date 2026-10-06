package org.application.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.application.Views;

public final class MainView {

    private MainView() {
    }

    public static void run() {
        Label label = new Label("Hello, JavaFX!");

        Button button = new Button("Go to Settings");
        button.setOnAction(event -> {
            Views.show("settings");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 800, 600);

        Views.add("main", scene);
    }
}
