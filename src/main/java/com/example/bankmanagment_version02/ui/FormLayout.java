package com.example.bankmanagment_version02.ui;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

public class FormLayout extends Pane {
    private final double rowGap = 10;
    private final double columnGap = 10;
    private double inputFieldHeight;
    private double labelWidth;
    private double inputFieldWidth;

    public FormLayout() {
        super();
      //  setStyle("-fx-background-color: #D429C3;");
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        labelWidth = getLabelMaxWidth();
        double labelHeight = getLabelMaxHeight();
        double y = 0;
        inputFieldHeight = labelHeight + 10;

        //placing the labels
        for (int i = 0; i < getChildren().size(); i = i + 2) {
            double labelDownY = (inputFieldHeight - labelHeight) / 2;
            positionChildren(getChildren().get(i), 0, y + labelDownY, labelWidth, labelHeight);
            y = y + inputFieldHeight + rowGap;
            //
        }
        //placing the inputField
        y = 0;
        for (int i = 1; i < getChildren().size(); i = i + 2) {
            double x = labelWidth + columnGap;
            inputFieldWidth = 3 * labelWidth;
            positionChildren(getChildren().get(i), x, y, inputFieldWidth, inputFieldHeight);
            y = y + inputFieldHeight + rowGap;
        }

    }

    private double getLabelMaxWidth() {
        double maxWidth = 0;
        for (int i = 0; i < getChildren().size(); i += 2) {
            Node child = getChildren().get(i);
            double childWidth = child.getBoundsInParent().getWidth();
            maxWidth = Math.max(maxWidth, childWidth);
        }
        return maxWidth;
    }

    private double getLabelMaxHeight() {
        double maxHeight = 0;
        for (int i = 0; i < getChildren().size(); i += 2) {
            Node child = getChildren().get(i);
            double childHeight = child.getBoundsInParent().getHeight();
            maxHeight = Math.max(maxHeight, childHeight);
        }
        return maxHeight;
    }

    private void positionChildren(Node child, double x, double y, double width, double height) {
        child.setLayoutX(x);
        child.setLayoutY(y);
        child.resize(width, height);
    }

    @Override
    public void resize(double width, double height) {
        //This method will run when the window appear first time
        //and
        //when the user resize the window


        double padding=10;
        int numberOfRow = getChildren().size() / 2;
        double eachRowHeight = inputFieldHeight + rowGap;
        double layoutHeight = (numberOfRow * eachRowHeight) - rowGap+padding;
        double layoutWidth = labelWidth + columnGap + inputFieldWidth+padding;
        super.resize(layoutWidth, layoutHeight); // set fixed width and height
    }

}

