package library.inputype;

import javafx.scene.Node;
import javafx.scene.control.TextField;

public class TextFieldInputField implements InputField {
    private final TextField textField;

    public TextFieldInputField() {
        textField = new TextField();
    }
    public TextFieldInputField(double width) {
        textField = new TextField();
        textField.setPrefWidth(width);
    }
    public TextFieldInputField(double width,double height) {
        textField = new TextField();
        textField.setPrefWidth(width);
        textField.setPrefHeight(height);
    }

    @Override
    public Node getInputField() {
        return textField;
    }

}
