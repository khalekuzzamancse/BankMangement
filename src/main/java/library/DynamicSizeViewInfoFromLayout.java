package library;


import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Size;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.HashMap;


public class DynamicSizeViewInfoFromLayout extends Pane {
    private final double rowGap = 10;
    private final double columnGap = 10;

    private double labelMaxWidth;
    private final Insets padding = new Insets(10);


    public DynamicSizeViewInfoFromLayout() {
        super();
        setPadding(padding);
        setStyle("-fx-background-color: #D429C3;");

    }


    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        labelMaxWidth = getLabelMaxWidth();
        double y = padding.getTop();

        // //placing the labels
        for (int i = 0; i < getChildren().size(); i = i + 2) {
            Bounds viewBounds = getChildren().get(i+1).getLayoutBounds();
            Bounds labelBounds = getChildren().get(i).getLayoutBounds();
            double labelDownY = (viewBounds.getHeight() - labelBounds.getHeight()) / 2;
            positionChildren(getChildren().get(i), padding.getLeft(), y + labelDownY);
            y = y + Math.max(viewBounds.getHeight(),labelBounds.getHeight()) + rowGap;
            //
        }
        //placing the inputField
        y = padding.getTop();
        for (int i = 1; i < getChildren().size(); i = i + 2) {
            Bounds viewBounds = getChildren().get(i).getLayoutBounds();
            double x = padding.getLeft() + labelMaxWidth + columnGap;
            positionChildren(getChildren().get(i), x, y);
            y = y + viewBounds.getHeight() + rowGap;
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

    private void positionChildren(Node child, double x, double y) {
        child.setLayoutX(x);
        child.setLayoutY(y);
    }

    @Override
    public void resize(double width, double height) {
        super.resize(width, height); // set fixed width and height
    }


}

