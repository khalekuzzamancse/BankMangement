package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.data.model.BoxListModel;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModelI;

public class BoxListViewModelTable implements TableViewInfoViewModelI<AddBoxModel> {

    @Override
    public ObservableList<AddBoxModel> getTableData() {
        return new BoxListModel().getBoxes();
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Serial Number", "Height", "Width", "Old Price", "New Price"};
    }
}
