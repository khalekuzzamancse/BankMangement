package com.example.bankmanagment_version02.ui.customlayouts;

import com.example.bankmanagment_version02.ui.viewmodel.HetarogenousFormVIewModel;
import com.example.bankmanagment_version02.ui.viewmodel.InputFieldType;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

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
                ImageView imageView = new ImageView("img.png");
                imageView.setFitWidth(100);
                imageView.setFitHeight(40);
                inputField = imageView;
            } else if(fieldType==InputFieldType.TextArea) {
                TextArea textArea = new TextArea();
                textArea.setWrapText(true);
                textArea.setStyle("-fx-font-size: 14; -fx-alignment: center;");
                inputField = textArea;

            } else {
                inputField = new TextField();
            }
            customLayout.getChildren().addAll(label, inputField);
        }
        setSize();

        Button button = new Button(viewModel.getDoneButtonLabel());
        button.setOnAction(event -> {

            for (int i = 1; i < customLayout.getChildren().size(); i = i + 2) {
                if (customLayout.getChildren().get(i) instanceof TextArea) {
                    String input = ((TextArea) customLayout.getChildren().get(i)).getText();
                    String label = ((Label) customLayout.getChildren().get(i - 1)).getText();
                    viewModel.saveFormData().put(label, input);
                }
                else {
                    String input = ((TextField) customLayout.getChildren().get(i)).getText();
                    String label = ((Label) customLayout.getChildren().get(i - 1)).getText();
                    viewModel.saveFormData().put(label, input);
                }
            }
            viewModel.onDone();


        });
        this.getChildren().addAll(customLayout, button);
    }

    private void setSize() {
        for (Map.Entry<Integer, Double> entry : viewModel.getInputFieldWidths().entrySet()) {
            Integer childIndex = entry.getKey();
            Double width = entry.getValue();
            customLayout.setInputFieldWidth(childIndex, width);
        }
        for (Map.Entry<Integer, Double> entry : viewModel.getInputFieldHeights().entrySet()) {
            Integer childIndex = entry.getKey();
            Double height = entry.getValue();
            customLayout.setInputFieldHeight(childIndex, height);
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
