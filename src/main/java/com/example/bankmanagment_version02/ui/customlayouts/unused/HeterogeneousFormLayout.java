package com.example.bankmanagment_version02.ui.customlayouts.unused;

import com.example.bankmanagment_version02.ui.customlayouts.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.ui.viewmodel.HetarogenousFormVIewModel;
import com.example.bankmanagment_version02.ui.viewmodel.InputFieldType;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Map;

public class HeterogeneousFormLayout extends Pane {
    private final HetarogenousFormVIewModel viewModel;
    private DynamicSizeFromLayout customLayout;

    public HeterogeneousFormLayout(HetarogenousFormVIewModel viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        customLayout = new DynamicSizeFromLayout();
        for (Map.Entry<String, InputFieldType> entry : viewModel.labelList().entrySet()) {
            String labelText = entry.getKey();
            InputFieldType fieldType = entry.getValue();
            Label label = new Label(labelText);
            Node inputField;
            if (fieldType == InputFieldType.ImageView) {
                inputField = createImageView();
            } else if (fieldType == InputFieldType.TextArea) {
                inputField = createTextArea();
            } else {
                inputField = new TextField();
            }
            customLayout.getChildren().addAll(label, inputField);
        }

        customLayout.getChildIndex("Duration(Month)");
        setSize();
        Button button = createDoneButton();
        this.getChildren().addAll(customLayout, button);
    }

    private TextArea createTextArea() {
        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
        return textArea;
    }

    private ImageView createImageView() {
        ImageView imageView = new ImageView("upload_image.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(40);
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
        return imageView;
    }

    private Button createDoneButton() {
        Button button = new Button(viewModel.getDoneButtonLabel());
        button.setOnAction(event -> {
            for (int i = 1; i < customLayout.getChildren().size(); i = i + 2) {
                String label = ((Label) customLayout.getChildren().get(i - 1)).getText();
                if (customLayout.getChildren().get(i) instanceof TextArea) {
                    String input = ((TextArea) customLayout.getChildren().get(i)).getText();
                    viewModel.saveFormData().put(label, input);
                } else if (customLayout.getChildren().get(i) instanceof TextField) {
                    String input = ((TextField) customLayout.getChildren().get(i)).getText();
                    viewModel.saveFormData().put(label, input);
                } else if (customLayout.getChildren().get(i) instanceof ImageView) {

                    Image image = ((ImageView) customLayout.getChildren().get(i)).getImage();
                    viewModel.saveFormData().put(label, image);
                }
            }
            viewModel.onDone();

        });
        return button;
    }

    private void setSize() {
        for (Map.Entry<String, Double> entry : viewModel.getInputFieldWidths().entrySet()) {
            String labelName = entry.getKey();
            Double width = entry.getValue();
            customLayout.setInputFieldWidth(labelName, width);
        }
        for (Map.Entry<String, Double> entry : viewModel.getInputFieldHeights().entrySet()) {
            String labelName = entry.getKey();
            Double height = entry.getValue();
            customLayout.setInputFieldHeight(labelName, height);
        }
    }


    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        DynamicSizeFromLayout customLayout = (DynamicSizeFromLayout) this.getChildren().get(0);
        double formHeight = customLayout.getHeight();
        double formWidth = customLayout.getWidth();
        positionChildren(customLayout, 0, 0, formWidth, formHeight);
        //

        positionChildren(this.getChildren().get(1), (formWidth - 60), formHeight, 60, 40);
        LayoutUtil.alignCenter(this, getChildren());
    }

    private void positionChildren(Node child, double x, double y, double width, double height) {
        child.setLayoutX(x);
        child.setLayoutY(y);
        child.resize(width, height);
    }

    @Override
    public void resize(double width, double height) {
        double padding = 5;
        double layoutHeight = 0;
        double layoutWidth = 0;
        for (Node child : getChildren()) {
            layoutHeight = layoutHeight + child.getBoundsInParent().getHeight() + padding;
            layoutWidth = Math.max(layoutWidth, child.getBoundsInParent().getWidth()) + padding;
        }

        super.resize(layoutWidth, layoutHeight); // set fixed width and height
        LayoutUtil.alignCenter(this, getChildren());
    }


}
