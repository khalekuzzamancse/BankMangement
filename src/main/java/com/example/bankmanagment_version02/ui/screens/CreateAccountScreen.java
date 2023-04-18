package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AccountViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.LoginFormViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

public class CreateAccountScreen {
    private final Stage window;

    public CreateAccountScreen() {
        HomogenousInputFieldFormLayout layout =
                new HomogenousInputFieldFormLayout(new AccountViewModel());
        String title = "Create Account Screen";
        int width = 500;
        int height = 700;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
