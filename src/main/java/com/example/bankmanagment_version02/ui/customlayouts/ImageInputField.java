package com.example.bankmanagment_version02.ui.customlayouts;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;

public class ImageInputField implements InputField {
    private ImageView imageView;

    public ImageInputField() {
        imageView = new ImageView("upload_image.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(40);
        setListener();
    }


    private void setListener() {
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                // Open a file chooser dialog
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Open Image");
                fileChooser.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));
                File selectedFile = fileChooser.showOpenDialog(null);

                // If a file is selected, set the ImageView's image to the selected file
                if (selectedFile != null) {
                    imageView.setImage(new Image(selectedFile.toURI().toString()));
                }
            }
        });
    }

    @Override
    public Node getInputField() {
        return imageView;
    }

}
