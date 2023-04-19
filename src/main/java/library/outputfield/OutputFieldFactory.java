package library.outputfield;

import javafx.scene.image.Image;

public class OutputFieldFactory {

    private static final OutputFieldFactory instance = new OutputFieldFactory();

    private OutputFieldFactory() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static OutputFieldFactory instance() {
        return instance;
    }

    public OutputField getTextInputField(String text) {
        return new TextOutputField(text);
    }
    public OutputField getTextInputField(String text,Double width) {
        return new TextOutputField(text,width);
    }
    public OutputField getImageOutPutField(Image image) {
        return new ImageOutputField(image);
    }
}
