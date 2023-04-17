package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.data.model.BoxListModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ViewModel1 implements ViewInfoViewModelI<AddBoxModel> {

    @Override
    public ObservableList<AddBoxModel> getTableData() {
        return new BoxListModel().getBoxes();
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Serial Number", "Height", "Width", "Old Price", "New Price"};
    }
}
