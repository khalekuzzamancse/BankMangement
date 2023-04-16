package com.example.bankmanagment_version02;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginViewModel {
    private final LoginModel model;
    private final StringProperty userNameProperty;
    private final StringProperty passwordProperty;

    public LoginViewModel() {
        this.model = new LoginModel();
        this.userNameProperty = new SimpleStringProperty();
        this.passwordProperty = new SimpleStringProperty();
    }

    public void setUserName(String userName) {
        this.userNameProperty.set(userName);
        model.setUserName(userName);
    }

    public void setPassword(String password) {
        this.passwordProperty.set(password);
        model.setPassword(password);
    }

    public boolean isValidUser() {
        return model.isValidUser();
    }

    public StringProperty userNameProperty() {
        return userNameProperty;
    }

    public StringProperty passwordProperty() {
        return passwordProperty;
    }
}
