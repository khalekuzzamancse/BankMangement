package library.layouts;


import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Pane;


public class BaseViewInfoFromLayout extends Pane {

    private final Insets padding = new Insets(10);


    public BaseViewInfoFromLayout() {
        super();
        setPadding(padding);
        //  setStyle("-fx-background-color: #D429C3;");

    }


    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        double labelMaxWidth = getLabelMaxWidth();
        double y = padding.getTop();

        for (int i = 0; i < getChildren().size(); i = i + 3) {
            Node outputField = getChildren().get(i + 2);
            Bounds viewBounds = outputField.getLayoutBounds();
            Bounds labelBounds = getChildren().get(i).getLayoutBounds();
            //
            double outputFieldHeight = viewBounds.getHeight();
            double labelHeight = labelBounds.getHeight();
            double labelDownY = (outputFieldHeight - labelHeight) / 2;
            double x = padding.getLeft();
            //placing the labels
            Node label = getChildren().get(i);
            positionChildren(label, x, y + labelDownY);
            //Placing the colon
            Node colon = getChildren().get(i + 1);
            double x1 = padding.getLeft() + labelMaxWidth+2;
            positionChildren(colon, x1, y + labelDownY);
            //placing the outputField
            double x2 = padding.getLeft() + labelMaxWidth + 10;
            positionChildren(outputField, x2, y);
            double rowGap = 10;
            y = y +viewBounds.getHeight()+ rowGap;
        }


    }

    private double getLabelMaxWidth() {
        double maxWidth = 0;
        for (int i = 0; i < getChildren().size(); i += 3) {
            Node child = getChildren().get(i);
            double childWidth = child.getBoundsInParent().getWidth();
            maxWidth = Math.max(maxWidth, childWidth);
        }
        return maxWidth;
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

