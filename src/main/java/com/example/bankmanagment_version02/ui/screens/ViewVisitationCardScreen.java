package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.InfoViewLeaseFormLayoutViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.VisitationCardInfoViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.stage.Stage;
import library.layouts.InfoViewFormLayoutViewModel;
import library.layouts.ViewInfoLabelToFormLayout;

public class ViewVisitationCardScreen {
    private final Stage window;
    private final InfoViewFormLayoutViewModel viewModel;


    public ViewVisitationCardScreen() {
        viewModel = new VisitationCardInfoViewModel();
        ViewInfoLabelToFormLayout leaseForm = new ViewInfoLabelToFormLayout(
                viewModel.getLabelList()
        );
        window = new Window(leaseForm, "Rent Screen", 500, 600).getWindow();
    }
    public Stage getWindow() {
        return window;
    }


}
