package com.example.bankmanagment_version02.utils;

import com.example.bankmanagment_version02.ui.screens.ViewScreen;
import com.example.bankmanagment_version02.ui.viewmodel.AccountListViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.BoxListViewModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Windows {
    private static Windows instance = null;

    private Windows() {

    }

    private static Stage getWindow(Pane layout, String title,int width,int height) {
        Stage stage = StageFactory.createStage(layout, title, width, height);
        return stage;
    }

    public static Windows getInstance() {
        if (instance == null) {
            instance = new Windows();
        }
        return instance;
    }

    public Stage boxListWindow() {
        return getWindow(new ViewScreen<>(new BoxListViewModel()), "Box List",400,400);
    }
    public Stage accountListWindow() {
        return getWindow(new ViewScreen<>(new AccountListViewModel()), "Account List",800,300);
    }

    public void setWindowSize(Stage window, int width, int height) {
        window.setMinWidth(width);
        window.setMinHeight(height);
    }
}
