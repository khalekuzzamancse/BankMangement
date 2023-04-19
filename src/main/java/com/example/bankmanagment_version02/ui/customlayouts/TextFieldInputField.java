package com.example.bankmanagment_version02.ui.customlayouts;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;

public class TextFieldInputField implements InputField {
    private TextField textField;

    public TextFieldInputField() {
        textField = new TextField();
    }

    @Override
    public Node getInputField() {
        return textField;
    }

}
