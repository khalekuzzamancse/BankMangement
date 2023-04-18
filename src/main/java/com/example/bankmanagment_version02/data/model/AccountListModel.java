package com.example.bankmanagment_version02.data.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AccountListModel {
    private final ObservableList<CreateAccountFormModel> accounts;

    public AccountListModel() {
        accounts = FXCollections.observableArrayList();
        accounts.addAll(
                new CreateAccountFormModel("John", "khalekuzzaman91@gmail.com", "123456789", "123 Main St", "ABC Corp",
                        "brown", "blue", 6.0, 170.0),
                new CreateAccountFormModel("Jane", "khalekuzzaman91@gmail.com", "987654321", "456 Elm St", "XYZ Corp",
                        "blonde", "green", 5.5, 120.0),
                new CreateAccountFormModel("Alice", "khalekuzzaman91@gmail.com", "111111111", "789 High St", "PQR Corp",
                        "black", "brown", 5.8, 150.0),
                new CreateAccountFormModel("Bob", "khalekuzzaman91@gmail.com", "222222222", "321 Oak St", "DEF Corp",
                        "blonde", "blue", 5.7, 140.0),
                new CreateAccountFormModel("Sarah", "khalekuzzaman91@gmail.com", "333333333", "555 Pine St", "GHI Corp",
                        "brown", "green", 5.6, 130.0)
        );
    }

    public ObservableList<CreateAccountFormModel> getAccounts() {
        return accounts;
    }
}

