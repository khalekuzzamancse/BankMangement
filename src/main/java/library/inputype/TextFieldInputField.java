package library.inputype;

import javafx.scene.Node;
import javafx.scene.control.TextField;

public class TextFieldInputField implements InputField {
    private final TextField textField;

    public TextFieldInputField() {
        textField = new TextField();
    }

    @Override
    public Node getInputField() {
        return textField;
    }

}
