package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.VisitationModel;
import com.example.bankmanagment_version02.data.model.VisitationModelWithImage;
import com.example.bankmanagment_version02.repository.Reposititory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import library.TableViewInfoViewModel;

import java.util.List;

public class ViewVisitationTableWithImageViewModel implements TableViewInfoViewModel<VisitationModelWithImage> {

    @Override
    public ObservableList<VisitationModelWithImage> getTableData() {
        List<VisitationModelWithImage> boxes = Reposititory.getVisitationsWithImage();
        return FXCollections.observableList(boxes);
    }


    @Override
    public String[] getTableColumnName() {
        return new String[]{"Account No", "Box Key", "As Deputy", "Date", "Time","Description"};
    }
}
