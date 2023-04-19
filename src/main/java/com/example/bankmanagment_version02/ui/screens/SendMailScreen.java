package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.customlayouts.HeterogeneousFormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.SendMailFromViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

public class SendMailScreen {
    private final Stage window;
    public SendMailScreen() {
        HeterogeneousFormLayout layout =
                new HeterogeneousFormLayout(new SendMailFromViewModel());
        String title = "Send Main Screen";
        int width = 500;
        int height = 400;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
