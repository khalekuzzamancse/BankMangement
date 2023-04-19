package com.example.bankmanagment_version02.ui.customlayouts;

import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TextAreaInputField implements InputField {
    private final TextArea textArea;

    public TextAreaInputField() {
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
    }

    @Override
    public Node getInputField() {
        return textArea;
    }

}
