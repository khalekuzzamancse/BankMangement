package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.customlayouts.CommonFormLayout;
import com.example.bankmanagment_version02.ui.customlayouts.HeterogeneousFormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.LeaseFormViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

public class LeaseScreen {
    private final Stage window;

    public LeaseScreen() {
        CommonFormLayout layout = new CommonFormLayout(new LeaseFormViewModel());
        String title = "Rent Screen";
        int width = 500;
        int height = 600;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
