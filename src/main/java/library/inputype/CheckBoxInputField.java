package library.inputype;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;

public class CheckBoxInputField implements InputField {
    private CheckBox checkBox;

    public CheckBoxInputField(String label) {
        checkBox = new CheckBox(label);
    }

    @Override
    public Node getInputField() {
        return checkBox;
    }
}
