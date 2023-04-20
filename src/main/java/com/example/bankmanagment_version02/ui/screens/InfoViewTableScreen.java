package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.data.model.*;
import com.example.bankmanagment_version02.ui.viewmodel.*;
import com.example.bankmanagment_version02.utils.Window;
import javafx.stage.Stage;
import library.layouts.GenericViewScreen;

public class InfoViewTableScreen {
    public InfoViewTableScreen() {

        // Set the scene of the stage
//        GenericViewScreen<AddBoxModel> layout = new GenericViewScreen<>(new BoxListViewModelTable());
//        Stage window = new Window(layout, "Box List", 500, 700).getWindow();
//        window.show();
//        GenericViewScreen<AddAccountModel> accountListLayout = new GenericViewScreen<>(new AccountListViewModelTable());
//        Stage accountListWindow = new Window(accountListLayout, "Account List", 500, 700).getWindow();
//        accountListWindow.show();
//        GenericViewScreen<AddLeaseModel> leaseListLayout = new GenericViewScreen<>(new ViewLeaseTableViewModel());
//        Stage leaseListLayoutWindow = new Window(leaseListLayout, "Least List", 500, 700).getWindow();
//        leaseListLayoutWindow.show();
//GenericViewScreen<VisitationModel> visitationLayout = new GenericViewScreen<>(new ViewVisitationTableViewModel());
//        Stage visitationLayoutWindow = new Window(visitationLayout, "Visitation List", 500, 700).getWindow();
//        visitationLayoutWindow.show();
        GenericViewScreen<VisitationModelWithImage> visitationLayout = new GenericViewScreen<>(new ViewVisitationTableWithImageViewModel());
        Stage visitationLayoutWindow = new Window(visitationLayout, "Visitation List", 500, 700).getWindow();
        visitationLayoutWindow.show();

    }
}
