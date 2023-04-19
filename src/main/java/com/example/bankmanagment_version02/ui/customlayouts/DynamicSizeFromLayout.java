package com.example.bankmanagment_version02.ui.customlayouts;


import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Size;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.HashMap;


public class DynamicSizeFromLayout extends Pane {
    private final double rowGap = 10;
    private final double columnGap = 10;

    private double labelMaxWidth;
    private double labelMaxHeight;
    private final Insets padding = new Insets(10);

    private final HashMap<Integer, Size> sizes = new HashMap<>();


    public DynamicSizeFromLayout() {
        super();
        setPadding(padding);
        //   setStyle("-fx-background-color: #D429C3;");
    }


    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        labelMaxWidth = getLabelMaxWidth();
        labelMaxHeight = getLabelMaxHeight();
        initializeChildrenSize();
        //placing the labels
        double y = padding.getTop();
        //
        double labelWidth = labelMaxWidth;
        double labelHeight = labelMaxHeight;
        //
        double inputFieldHeight = labelHeight + 15;
        double inputFieldWidth = 2 * labelWidth;

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
        double totalVgap = (numberOfRow - 1) * rowGap;
        // double layoutHeight = (numberOfRow * eachRowHeight) - rowGap + padding.getTop() + padding.getBottom();
        double layoutHeight = LayoutUtil.getMaxSum(sizes) + totalVgap + padding.getTop() + padding.getBottom();
        //  double layoutWidth = labelWidth + columnGap + inputFieldWidth + padding.getLeft() + padding.getRight();
        double layoutWidth = labelMaxWidth + columnGap + LayoutUtil.getMaxWidth(sizes) + padding.getLeft() + padding.getRight();
        super.resize(layoutWidth, layoutHeight); // set fixed width and height

    }

    public void setInputFieldSize(String labelName, double width, double height) {
        setInputFieldWidth(labelName, width);
        setInputFieldHeight(labelName, height);

    }

    public void setInputFieldWidth(String labelName, double width) {
        initializeChildrenSize();
        int index = getChildIndex(labelName);
        if (index != -1) {
            index++;//next index it the input field of the correspond label
            sizes.put(index, new Size(width, sizes.get(index).getHeight()));
            layoutChildren();
        }

    }

    public void setInputFieldHeight(String labelName, double height) {
        initializeChildrenSize();
        int index = getChildIndex(labelName);
        if (index != -1) {
            index++;//next index it the input field of the correspond label
            sizes.put(index, new Size(sizes.get(index).getWidth(), height));
            layoutChildren();
        }
    }

    private void initializeChildrenSize() {

        double inputFieldWidth = labelMaxWidth + 100;
        double extra = 10.0;
        double inputFieldHeight = labelMaxHeight + extra;

        for (int i = 0; i < getChildren().size(); i++) {
            if (i % 2 == 1) {
                Size inputFieldSize = sizes.get(i);
                if (inputFieldSize != null) {
                    boolean hasHeight = (inputFieldSize.hasHeight()) && (inputFieldSize.getHeight() != extra);
                    if (!hasHeight) {
                        //if the height is not set then set the height
                        sizes.put(i, new Size(inputFieldSize.getWidth(), inputFieldHeight));
                    }

                    if (!inputFieldSize.hasWidth()) {
                        //if the width is not set then set the width
                        sizes.put(i, new Size(inputFieldWidth, inputFieldSize.getHeight()));
                    }

                } else {
                    sizes.put(i, new Size(inputFieldWidth, inputFieldHeight));
                }

            } else {
                sizes.put(i, new Size(labelMaxWidth, labelMaxHeight));
            }

        }
    }

    public int getChildIndex(String childName) {
        int index = -1;
        ObservableList<Node> children = getChildren();
        for (int i = 0; i < children.size(); i++) {
            Node child = children.get(i);
            if (child instanceof Label && childName.equals(((Label) child).getText())) {
                index = i;
                break;
            }
            if (childName.equals(child.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }


}

