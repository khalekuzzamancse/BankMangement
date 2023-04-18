package com.example.bankmanagment_version02.data.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoxListModel {
    private ObservableList<CreateBoxFormModel> boxes;

    public BoxListModel() {
        boxes = FXCollections.observableArrayList();
        boxes.addAll(
                new CreateBoxFormModel("1", 10.0, 20.0, 50.0, 40.0),
                new CreateBoxFormModel("2", 15.0, 25.0, 80.0, 70.0),
                new CreateBoxFormModel("3", 8.0, 15.0, 30.0, 25.0),
                new CreateBoxFormModel("4", 12.0, 18.0, 60.0, 50.0),
                new CreateBoxFormModel("5", 20.0, 30.0, 100.0, 90.0),
                new CreateBoxFormModel("6", 6.0, 12.0, 20.0, 15.0),
                new CreateBoxFormModel("7", 18.0, 24.0, 90.0, 80.0),
                new CreateBoxFormModel("8", 9.0, 16.0, 40.0, 35.0),
                new CreateBoxFormModel("9", 16.0, 22.0, 70.0, 60.0),
                new CreateBoxFormModel("10", 14.0, 20.0, 50.0, 45.0)
        );
    }

    public ObservableList<CreateBoxFormModel> getBoxes() {
        return boxes;
    }
}
