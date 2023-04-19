package library.inputype;

import javafx.scene.Node;
import javafx.scene.control.TextArea;

public class TextAreaInputField implements InputField {
    private final TextArea textArea;

    public TextAreaInputField() {
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
    }
    public TextAreaInputField(double width) {
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
        textArea.setPrefWidth(width);
    }
    public TextAreaInputField(int height) {
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
        textArea.setPrefHeight(height);
    }
    public TextAreaInputField(double width,double height) {
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
        textArea.setPrefWidth(width);
        textArea.setPrefHeight(height);
    }

    @Override
    public Node getInputField() {
        return textArea;
    }

}
