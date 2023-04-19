package com.example.bankmanagment_version02.utils;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Window {
    private final Stage window;

    public Window(Pane layout, String title, int width, int height) {
        window = StageFactory.createStage(layout, title, width, height);
        setWindowMinSize(width, height);
    }

    public void setWindowMinSize(int width, int height) {
        window.setMinWidth(width);
        window.setMinHeight(height);
    }

    public void closeWindow() {
        window.close();
    }
    public void showWindow() {
        window.show();
    }

    public Stage getWindow() {
        return window;
    }
}
