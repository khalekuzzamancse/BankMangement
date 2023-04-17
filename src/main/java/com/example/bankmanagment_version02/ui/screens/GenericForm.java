package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.ui.FormLayout;
import com.example.bankmanagment_version02.ui.viewmodel.LoginViewModel;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Snackbar;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.Arrays;
import java.util.List;

public class GenericForm extends Pane {
    private final String buttonLabel;

    public GenericForm(List<String> labels, String buttonLabel, EventHandler<ActionEvent> buttonHandler) {
        this.buttonLabel = buttonLabel;
        createView(labels, buttonHandler);
    }

    private void createView(List<String> labels, EventHandler<ActionEvent> buttonHandler) {
        DynamicSizeFromLayout customLayout = new DynamicSizeFromLayout();
        for (String label : labels) {
            customLayout.getChildren().addAll(
                    new Label(label),
                    new TextField()
            );
        }
        Button button = new Button(buttonLabel);
        button.setOnAction(buttonHandler);
        this.getChildren().addAll(customLayout, button);
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        DynamicSizeFromLayout customLayout = (DynamicSizeFromLayout) this.getChildren().get(0);
        double formHeight =customLayout.getHeight();
        double formWidth =customLayout.getWidth();
        positionChildren(customLayout,0,0,formWidth,formHeight);
        //

        positionChildren(this.getChildren().get(1),(formWidth-60),formHeight,60,40);

    }

    private void positionChildren(Node child, double x, double y, double width, double height) {
        child.setLayoutX(x);
        child.setLayoutY(y);
        child.resize(width, height);
    }

}
