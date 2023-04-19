package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.customlayouts.HomogenousFormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.CreateAccountFromViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

public class CreateAccountScreen {
    private final Stage window;

    public CreateAccountScreen() {
        HomogenousFormLayout layout =
                new HomogenousFormLayout(new CreateAccountFromViewModel());
        String title = "Create Account Screen";
        int width = 500;
        int height = 700;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
