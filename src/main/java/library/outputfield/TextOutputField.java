package library.outputfield;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import library.inputype.InputField;

public class TextOutputField implements OutputField {
    private final Label textField;

    public TextOutputField(String text) {
        textField = new Label(text);
        textField.setPrefWidth(50);
        textField.setWrapText(true);
    }

    @Override
    public Node getOutputField() {
        return textField;
    }
}
