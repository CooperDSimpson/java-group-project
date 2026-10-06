package org.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.application.views.*;

public class State {
    public static Stage stage;

    public static void init(Stage startStage) {
        stage = startStage;

        Views.init();
        Views.show("main");
        MainLoop.start();
    }

    public static void setFullScreen(boolean value) {
        stage.setFullScreen(value);
    }

    public static boolean getFullScreen() {
        return stage.isFullScreen();
    }

}
