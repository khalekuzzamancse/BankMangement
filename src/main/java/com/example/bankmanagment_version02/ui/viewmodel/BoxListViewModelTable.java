package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.data.model.BoxListModel;
import com.example.bankmanagment_version02.repository.Reposititory;
import datastorage.file.FileHandling;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModel;

import java.util.List;

public class BoxListViewModelTable implements TableViewInfoViewModel<AddBoxModel> {

    @Override
    public ObservableList<AddBoxModel> getTableData() {
       // return new BoxListModel().getBoxes();
        List<AddBoxModel> boxes = Reposititory.getBoxes();
        return FXCollections.observableList(boxes);
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Serial Number", "Height", "Width", "Old Price", "New Price"};
    }
}
