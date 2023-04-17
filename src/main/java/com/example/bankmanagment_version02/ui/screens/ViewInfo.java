package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.data.model.AccountModel;
import com.example.bankmanagment_version02.ui.CustomTable;
import com.example.bankmanagment_version02.ui.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;

public class ViewInfo extends StackPane {
    public ViewInfo() {

        ObservableList<AccountModel> data = FXCollections.observableArrayList(
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
        String[] columnNames = {"Name", "Email", "Phone No", "Address", "Firm", "Eye Color", "Hair Color", "Height", "Weight"};

        // create custom table
        CustomTable<AccountModel> table1 = new CustomTable<>(columnNames, data);


        String[] columnNamess = {"Name", "Age", "Gender"};

        // create some dummy data
        ObservableList<Person> data2 = FXCollections.observableArrayList(
                new Person("John", 25, "Male"),
                new Person("Jane", 30, "Female"),
                new Person("Bob", 40, "Male")
        );

        CustomTable<Person> table2 = new CustomTable<>(columnNamess, data2);


        String[] columnNamesss = {"Name", "Age", "Gender"};

        // create some dummy data
        ObservableList<Person> data3 = FXCollections.observableArrayList(
                new Person("John", 25, "Male"),
                new Person("Jane", 30, "Female"),
                new Person("Bob", 40, "Male")
        );

        CustomTable<Person> table3 = new CustomTable<>(columnNamesss, data3);

        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("People");
        tab1.setContent(table1);
        Tab tab2 = new Tab("Locations");
        tab2.setContent(table2);
        Tab tab3 = new Tab("Items");
        tab3.setContent(table3);
        tabPane.getTabs().addAll(tab1, tab2, tab3);
        tab1.closableProperty().set(false);

        getChildren().add(tabPane);
    }
}


