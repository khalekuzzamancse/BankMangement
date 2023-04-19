package library.inputype;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;

public class ImageInputField implements InputField {
    private ImageView imageView;
    private InputFieldListener listener = null;

    public ImageInputField() {
        imageView = new ImageView("upload_image.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(40);
        imageView.setOnMouseClicked(mouseEvent -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Image");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));
            File selectedFile = fileChooser.showOpenDialog(null);
            if (selectedFile != null) {
                imageView.setImage(new Image(selectedFile.toURI().toString()));
            }
        });
    }

    public ImageInputField(String url,InputFieldListener listener) {
        imageView = new ImageView(url);
        imageView.setFitWidth(100);
        imageView.setFitHeight(40);
        imageView.setOnMouseClicked(mouseEvent -> {
            listener.onClick(imageView);
        });
    }



    @Override
    public Node getInputField() {
        return imageView;
    }

}
