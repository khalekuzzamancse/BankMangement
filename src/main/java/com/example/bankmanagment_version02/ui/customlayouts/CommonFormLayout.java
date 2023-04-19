package com.example.bankmanagment_version02.ui.customlayouts;

import com.example.bankmanagment_version02.utils.LayoutUtil;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.Map;

public class CommonFormLayout extends Pane {
    //this class is going to follow the open-close priciple
    //as a result when new input type is added we don't  need
    //to add  an extra if-else branch
    //and also we do not  need to modify this class
    //when a new InputType filed added
    private final CommonFormViewModel viewModel;
    private DynamicSizeFromLayout customLayout;

    public CommonFormLayout(CommonFormViewModel viewModel) {
        this.viewModel = viewModel;
        createView();
    }

    private void createView() {
        customLayout = new DynamicSizeFromLayout();
        for (Map.Entry<String, InputField> entry : viewModel.labelList().entrySet()) {
            String labelText = entry.getKey();
            InputField fieldType = entry.getValue();
            Label label = new Label(labelText);
            Node inputField = fieldType.getInputField();
            customLayout.getChildren().addAll(label, inputField);
        }
        setSize();
        Button button = createDoneButton();
        this.getChildren().addAll(customLayout, button);
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
