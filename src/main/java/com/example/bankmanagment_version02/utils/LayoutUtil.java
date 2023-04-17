package com.example.bankmanagment_version02.utils;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LayoutUtil {
    public static void alignCenter(Pane parent, List<Node> children) {
        double maxWidth = 0;
        double maxHeight = 0;
        for (Node child : children) {
            maxWidth = Math.max(maxWidth, child.getLayoutBounds().getWidth());
            maxHeight = Math.max(maxHeight, child.getLayoutBounds().getHeight());
        }
        parent.setMinWidth(maxWidth);
        parent.setMinHeight(maxHeight);
        parent.setMaxWidth(maxWidth);
        parent.setMaxHeight(maxHeight);
        parent.setTranslateX((parent.getScene().getWidth() - maxWidth) / 2);
        parent.setTranslateY((parent.getScene().getHeight() - maxHeight) / 2);
    }
    public static double getMaxSum(HashMap<Integer, Size> sizes) {
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
    public  static double getMaxWidth(HashMap<Integer, Size> sizes) {
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
