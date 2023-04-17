package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.CustomTable;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class ViewScreen<T> extends VBox {
    private final ViewInfoViewModelI<T> viewModel;
    public ViewScreen(ViewInfoViewModelI<T> viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        CustomTable<T> table1 = new CustomTable<>(viewModel.getTableColumnName(), viewModel.getTableData());
        getChildren().add(table1);
    }

}
