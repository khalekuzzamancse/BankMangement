package com.example.bankmanagment_version02.ui;


import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlexForm extends Pane {
    private final double rowGap = 10;
    private final double columnGap = 10;

    private double labelMaxWidth;
    private double labelMaxHeight;
    private final Insets padding = new Insets(10);

    double inputFieldHeight;
    double inputFieldWidth;
    double labelWidth;
    double labelHeight;
    // List<Size> sizes = new ArrayList<>();
    HashMap<Integer, Size> sizes = new HashMap<>();


    public FlexForm() {
        super();
        setPadding(padding);
        setStyle("-fx-background-color: #D429C3;");
    }


    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        labelMaxWidth = getLabelMaxWidth();
        labelMaxHeight = getLabelMaxHeight();
        System.out.println("init");
        initiazeSize();
        printSize();
        //placing the labels
        double y = padding.getTop();
        //
        labelWidth = labelMaxWidth;
        labelHeight = labelMaxHeight;
        //
        inputFieldHeight = labelHeight + 10;
        inputFieldWidth = 2 * labelWidth;

        //
        for (int i = 0; i < getChildren().size(); i = i + 2) {
            double inputFieldH = sizes.get(i + 1).getHeight();
            double labelDownY = (inputFieldH - labelHeight) / 2;

            double height = sizes.get(i).getHeight();
            double width = sizes.get(i).getWidth();

            positionChildren(getChildren().get(i), padding.getLeft(), y + labelDownY, width, height);
            y = y + inputFieldH + rowGap;
            //
        }
        //placing the inputField
        y = padding.getTop();
        for (int i = 1; i < getChildren().size(); i = i + 2) {
            double height = sizes.get(i).getHeight();
            double width = sizes.get(i).getWidth();
            double x = padding.getLeft() + labelWidth + columnGap;
            positionChildren(getChildren().get(i), x, y, width, height);
            y = y + height + rowGap;
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

        int numberOfRow = getChildren().size() / 2;
        double totalVgap = (numberOfRow -1)*rowGap;
       // double layoutHeight = (numberOfRow * eachRowHeight) - rowGap + padding.getTop() + padding.getBottom();
        double layoutHeight = getMaxSum(sizes) + totalVgap+ padding.getTop() + padding.getBottom();
      //  double layoutWidth = labelWidth + columnGap + inputFieldWidth + padding.getLeft() + padding.getRight();
        double layoutWidth = labelMaxWidth + columnGap + getMaxWidth(sizes) + padding.getLeft() + padding.getRight();
        super.resize(layoutWidth, layoutHeight); // set fixed width and height

    }

    public void setInputFieldSize(int index, double width, double height) {
        sizes.put(index, new Size(width, height));
        System.out.println("Calling");
        printSize();
        layoutChildren();

    }

    private void initiazeSize() {

        double inputFieldWidth = 3 * labelMaxWidth;
        double inputFieldHeight = labelMaxHeight + 10;

        for (int i = 0; i < getChildren().size(); i++) {
            if (i % 2 == 1) {
                Size size = sizes.get(i);
                boolean b = size != null && size.isSized();
                if (size != null && b) {

                } else {
                    sizes.put(i, new Size(inputFieldWidth, inputFieldHeight));
                }

            } else {
                sizes.put(i, new Size(labelMaxWidth, labelMaxHeight));
            }

        }
    }

    private void printSize() {
        for (Map.Entry<Integer, Size> entry : sizes.entrySet()) {
            Integer key = entry.getKey();
            Size value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    private double getMaxSum(HashMap<Integer, Size> sizes) {
        double sumOdd = 0.0;
        double sumEven = 0.0;
        for (Map.Entry<Integer, Size> entry : sizes.entrySet()) {
            double height = entry.getValue().getHeight();
            if (entry.getKey() % 2 == 0) {
                sumEven += height;
            } else {
                sumOdd += height;
            }
        }

        return Math.max(sumOdd, sumEven);
    }
    public  double getMaxWidth(HashMap<Integer, Size> sizes) {
        double maxWidth = Double.NEGATIVE_INFINITY;

        for (Map.Entry<Integer, Size> entry : sizes.entrySet()) {
            double width = entry.getValue().getWidth();
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return maxWidth;
    }



}

