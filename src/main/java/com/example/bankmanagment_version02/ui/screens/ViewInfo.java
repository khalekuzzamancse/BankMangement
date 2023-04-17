package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.data.model.AccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.ui.CustomTable;
import com.example.bankmanagment_version02.ui.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;

public class ViewInfo extends StackPane {
    public ViewInfo() {

        ObservableList<AccountModel> accounts = FXCollections.observableArrayList(
                new AccountModel("John", "khalekuzzaman91@gmail.com", "123456789", "123 Main St", "ABC Corp",
                        "brown", "blue", 6.0, 170.0),
                new AccountModel("Jane", "khalekuzzaman91@gmail.com", "987654321", "456 Elm St", "XYZ Corp",
                        "blonde", "green", 5.5, 120.0),
                new AccountModel("Alice", "khalekuzzaman91@gmail.com", "111111111", "789 High St", "PQR Corp",
                        "black", "brown", 5.8, 150.0),
                new AccountModel("Bob", "khalekuzzaman91@gmail.com", "222222222", "321 Oak St", "DEF Corp",
                        "blonde", "blue", 5.7, 140.0),
                new AccountModel("Sarah", "khalekuzzaman91@gmail.com", "333333333", "555 Pine St", "GHI Corp",
                        "brown", "green", 5.6, 130.0)
        );


        // create column names
        String[] accountColumn = {"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};

        // create custom table
        CustomTable<AccountModel> table1 = new CustomTable<>(accountColumn, accounts);

        ObservableList<AddBoxModel> boxes = FXCollections.observableArrayList(
                new AddBoxModel("1", 10.0, 20.0, 50.0, 40.0),
                new AddBoxModel("2", 15.0, 25.0, 80.0, 70.0),
                new AddBoxModel("3", 8.0, 15.0, 30.0, 25.0),
                new AddBoxModel("4", 12.0, 18.0, 60.0, 50.0),
                new AddBoxModel("5", 20.0, 30.0, 100.0, 90.0),
                new AddBoxModel("6", 6.0, 12.0, 20.0, 15.0),
                new AddBoxModel("7", 18.0, 24.0, 90.0, 80.0),
                new AddBoxModel("8", 9.0, 16.0, 40.0, 35.0),
                new AddBoxModel("9", 16.0, 22.0, 70.0, 60.0),
                new AddBoxModel("10", 14.0, 20.0, 50.0, 45.0)
        );
        String[] boxColumn = new String[]{"Serial Number", "Height", "Width", "Old Price", "New Price"};
        CustomTable<AddBoxModel> table2 = new CustomTable<>(boxColumn, boxes);


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


