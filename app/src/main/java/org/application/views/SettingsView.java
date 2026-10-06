package org.application.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.application.Views;

public final class SettingsView {

    private SettingsView() {
    }

    public static void run() {
        Label label = new Label("Settings View");

        Button backButton = new Button("Back to Main");
        backButton.setOnAction(event -> {
            Views.show("main");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(label, backButton);

        Scene scene = new Scene(root, 800, 600);

        Views.add("settings", scene);
    }
}
