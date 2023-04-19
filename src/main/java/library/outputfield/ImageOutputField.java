package library.outputfield;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import library.inputype.InputField;
import library.inputype.InputFieldListener;

import java.io.File;

public class ImageOutputField implements OutputField {
    private final ImageView imageView;

    public ImageOutputField(Image image) {
        imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(30);
    }

    @Override
    public Node getOutputField() {
        return imageView;
    }

}
