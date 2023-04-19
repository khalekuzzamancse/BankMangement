package com.example.bankmanagment_version02.ui.customlayouts;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DoneButton implements CustomAction {
    private final Button button;
    public DoneButton(String label) {
        button = new Button(label);
    }


    @Override
    public Node getButton() {
        return button;
    }

    @Override
    public void setListener(DynamicSizeFromLayout form) {
        button.setOnAction(event -> {
            for (int i = 1; i < form.getChildren().size(); i = i + 2) {
                String label = ((Label) form.getChildren().get(i - 1)).getText();
                if (form.getChildren().get(i) instanceof TextArea) {
                    String input = ((TextArea) form.getChildren().get(i)).getText();
                    System.out.println(input);
                    // viewModel.saveFormData().put(label, input);
                } else if (form.getChildren().get(i) instanceof TextField) {
                    String input = ((TextField) form.getChildren().get(i)).getText();
                    System.out.println(input);
                    //   viewModel.saveFormData().put(label, input);
                } else if (form.getChildren().get(i) instanceof ImageView) {
                    Image image = ((ImageView) form.getChildren().get(i)).getImage();
                    System.out.println(image);
                    //  viewModel.saveFormData().put(label, image);
                }
            }
        });
    }
}
