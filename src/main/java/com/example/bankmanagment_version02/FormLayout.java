package com.example.bankmanagment_version02;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.List;

public class FormLayout extends Pane {


    public FormLayout() {
        super();
        setPrefWidth(200);
        setPrefHeight(100);
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        double labelWidth = getLabelMaxWidth();
        double labelHeight = getLabelMaxHeight();
        double y = 0.0,inputFieldHeight=labelHeight+15;
        for (int i = 0; i < getChildren().size(); i = i + 2) {
            double labelDownY=(inputFieldHeight-labelHeight)/2;
            positionChildren(getChildren().get(i), 0, y+labelDownY, labelWidth, labelHeight);
            double rowGap = 10;
            y = y + inputFieldHeight + rowGap;
        }
        y = 0;
        for (int i = 1; i < getChildren().size(); i = i + 2) {
            double columnGap = 10;
            double x = labelWidth + columnGap;
            positionChildren(getChildren().get(i), x, y, 100, inputFieldHeight);
            double rowGap = 10;
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

    private void positionChildren(Node child, double x, double y, double labelWidth, double labelHeight) {
        child.setLayoutX(x);
        child.setLayoutY(y);
        child.resize(labelWidth, labelHeight);

    }

}

