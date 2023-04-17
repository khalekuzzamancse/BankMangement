package com.example.bankmanagment_version02.ui.screens;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AddBoxViewModel {
    private final AddBoxModel model;
    private final StringProperty serialNumberProperty;
    private final StringProperty heightProperty;
    private final StringProperty widthProperty;
    private final StringProperty oldPriceProperty;
    private final StringProperty newPriceProperty;

    public AddBoxViewModel() {
        this.model = new AddBoxModel();
        this.serialNumberProperty = new SimpleStringProperty();
        this.heightProperty = new SimpleStringProperty();
        this.widthProperty = new SimpleStringProperty();
        this.oldPriceProperty = new SimpleStringProperty();
        this.newPriceProperty = new SimpleStringProperty();
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumberProperty.set(serialNumber);
        model.setSerialNumber(serialNumber);
    }

    public void setHeight(String height) {
        this.heightProperty.set(height);
        model.setHeight(Double.parseDouble(height));
    }

    public void setWidth(String width) {
        this.widthProperty.set(width);
        model.setWidth(Double.parseDouble(width));
    }

    public void setOldPrice(String oldPrice) {
        this.oldPriceProperty.set(oldPrice);
        model.setOldPrice(Double.parseDouble(oldPrice));
    }

    public void setNewPrice(String newPrice) {
        this.newPriceProperty.set(newPrice);
        model.setNewPrice(Double.parseDouble(newPrice));
    }

    public StringProperty serialNumberProperty() {
        return serialNumberProperty;
    }

    public StringProperty heightProperty() {
        return heightProperty;
    }

    public StringProperty widthProperty() {
        return widthProperty;
    }

    public StringProperty oldPriceProperty() {
        return oldPriceProperty;
    }

    public StringProperty newPriceProperty() {
        return newPriceProperty;
    }
    public void addBox() {
        // Save the account to the database or perform some other action
        System.out.println(model);
    }
    public boolean isValidBox() {
        return model.isValidBox();
    }


}
