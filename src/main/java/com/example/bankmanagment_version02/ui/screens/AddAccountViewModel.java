package com.example.bankmanagment_version02.ui.screens;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class AddAccountViewModel {
    private final AccountModel model;
    private final StringProperty nameProperty;
    private final StringProperty emailProperty;
    private final StringProperty phoneNoProperty;
    private final StringProperty addressProperty;
    private final StringProperty firmProperty;
    private final StringProperty hairColorProperty;
    private final StringProperty eyeColorProperty;
    private final StringProperty heightProperty;
    private final StringProperty weightProperty;

    public AddAccountViewModel() {
        this.model = new AccountModel();
        this.nameProperty = new SimpleStringProperty();
        this.emailProperty = new SimpleStringProperty();
        this.phoneNoProperty = new SimpleStringProperty();
        this.addressProperty = new SimpleStringProperty();
        this.firmProperty = new SimpleStringProperty();
        this.hairColorProperty = new SimpleStringProperty();
        this.eyeColorProperty = new SimpleStringProperty();
        this.heightProperty = new SimpleStringProperty();
        this.weightProperty = new SimpleStringProperty();
    }

    public void setName(String name) {
        this.nameProperty.set(name);
        model.setName(name);
    }

    public void setEmail(String email) {
        this.emailProperty.set(email);
        model.setEmail(email);
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNoProperty.set(phoneNo);
        model.setPhoneNo(phoneNo);
    }

    public void setAddress(String address) {
        this.addressProperty.set(address);
        model.setAddress(address);
    }

    public void setFirm(String firm) {
        this.firmProperty.set(firm);
        model.setFirm(firm);
    }

    public void setHairColor(String hairColor) {
        this.hairColorProperty.set(hairColor);
        model.setHairColor(hairColor);
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColorProperty.set(eyeColor);
        model.setEyeColor(eyeColor);
    }

    public void setHeight(String height) {
        this.heightProperty.set(height);
        model.setHeight(Double.parseDouble(height));
    }

    public void setWeight(String weight) {
        this.weightProperty.set(weight);
        model.setWeight(Double.parseDouble(weight));
    }

    public void addAccount() {
        // Save the account to the database or perform some other action
        System.out.println(model);
    }

    public StringProperty nameProperty() {
        return nameProperty;
    }

    public StringProperty emailProperty() {
        return emailProperty;
    }

    public StringProperty phoneNoProperty() {
        return phoneNoProperty;
    }

    public StringProperty addressProperty() {
        return addressProperty;
    }

    public StringProperty firmProperty() {
        return firmProperty;
    }

    public StringProperty hairColorProperty() {
        return hairColorProperty;
    }

    public StringProperty eyeColorProperty() {
        return eyeColorProperty;
    }

    public StringProperty heightProperty() {
        return heightProperty;
    }

    public StringProperty weightProperty() {
        return weightProperty;
    }
}
