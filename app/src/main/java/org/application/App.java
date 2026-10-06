package org.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.application.views.*;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        State.init(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
