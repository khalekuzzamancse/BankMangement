package com.example.bankmanagment_version02;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.List;

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


}
