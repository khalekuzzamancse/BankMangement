package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.InfoViewLeaseFormLayoutViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import library.layouts.BaseFromLayout;
import library.layouts.InfoViewFormLayoutViewModel;
import library.layouts.ViewInfoLabelToFormLayout;

public class ViewLeaseInfoScreen {
    private final Stage window;
    private final InfoViewFormLayoutViewModel viewModel;


    public ViewLeaseInfoScreen() {
        viewModel = new InfoViewLeaseFormLayoutViewModel();
        ViewInfoLabelToFormLayout leaseForm = new ViewInfoLabelToFormLayout(
                viewModel.getLabelList()
        );
        window = new Window(leaseForm, "Rent Screen", 500, 600).getWindow();
    }
    public Stage getWindow() {
        return window;
    }


}
