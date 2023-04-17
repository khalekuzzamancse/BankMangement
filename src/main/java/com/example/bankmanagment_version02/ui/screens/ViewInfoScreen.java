package com.example.bankmanagment_version02.ui.screens;
import com.example.bankmanagment_version02.data.model.AccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.ui.CustomTable;
import com.example.bankmanagment_version02.ui.viewmodel.ViewInfoViewModel;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;

public class ViewInfoScreen extends StackPane {
    private ViewInfoViewModel viewModel;

    public ViewInfoScreen() {
        viewModel = new ViewInfoViewModel();
        CustomTable<AccountModel> table1 = new CustomTable<>(viewModel.getAccountColumn(), viewModel.getAccounts());
        CustomTable<AddBoxModel> table2 = new CustomTable<>(viewModel.getBoxColumn(), viewModel.getBoxes());

        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("User Info");
        tab1.setContent(table1);
        Tab tab2 = new Tab("Boxes");
        tab2.setContent(table2);
        tabPane.getTabs().addAll(tab1, tab2);
        tab1.closableProperty().set(false);
        getChildren().add(tabPane);
    }
}


