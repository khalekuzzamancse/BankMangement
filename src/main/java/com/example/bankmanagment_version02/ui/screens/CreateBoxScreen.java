package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.customlayouts.HomogenousFormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.CreateBoxFromViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

public class CreateBoxScreen {
    private final Stage window;
    public CreateBoxScreen() {
        HomogenousFormLayout layout =
                new HomogenousFormLayout(new CreateBoxFromViewModel());
        String title = "Create Box Screen";
        int width = 500;
        int height = 400;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
