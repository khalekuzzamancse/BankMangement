package com.example.bankmanagment_version02;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StageFactory {
    public static Stage createStage(Pane layout, String title, int width, int height) {
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setWidth(width);
        stage.setHeight(height);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        return stage;
    }
}
