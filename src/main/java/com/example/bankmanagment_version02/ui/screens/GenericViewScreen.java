package com.example.bankmanagment_version02.ui.screens;

import library.CustomTable;
import library.ViewInfoViewModelI;
import javafx.scene.layout.VBox;

public class GenericViewScreen<T> extends VBox {
    private final ViewInfoViewModelI<T> viewModel;
    public GenericViewScreen(ViewInfoViewModelI<T> viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        CustomTable<T> table1 = new CustomTable<>(viewModel.getTableColumnName(), viewModel.getTableData());
        getChildren().add(table1);
    }

}
