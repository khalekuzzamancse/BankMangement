package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AddAccountModel;
import com.example.bankmanagment_version02.data.model.AddLeaseModel;
import com.example.bankmanagment_version02.repository.Reposititory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModel;

import java.util.List;

public class ViewLeaseTableViewModel implements TableViewInfoViewModel<AddLeaseModel> {

    @Override
    public ObservableList<AddLeaseModel> getTableData() {
        List<AddLeaseModel> boxes = Reposititory.getLeases();
        return FXCollections.observableList(boxes);
    }

    @Override
    public String[] getTableColumnName() {
        return new String[]{"Account No", "Box Key", "Deputy Name", "Deputy Address", "Deputy Phone No", "Duration","Rent Date","Expire Date"};
    }
}
