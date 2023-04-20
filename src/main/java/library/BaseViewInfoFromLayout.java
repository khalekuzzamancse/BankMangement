package library;


import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Pane;


public class BaseViewInfoFromLayout extends Pane {
    private final double rowGap = 10;
    private final double columnGap = 10;

    private double labelMaxWidth;
    private final Insets padding = new Insets(0);


    public BaseViewInfoFromLayout() {
        super();
        setPadding(padding);
      //  setStyle("-fx-background-color: #D429C3;");

    }


    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        labelMaxWidth = getLabelMaxWidth();
        double y = padding.getTop();

        for (int i = 0; i < getChildren().size(); i = i + 3) {
            Bounds viewBounds = getChildren().get(i + 2).getLayoutBounds();
            Bounds labelBounds = getChildren().get(i).getLayoutBounds();
            double outputFieldHeight = viewBounds.getHeight();
            double labelHeight = labelBounds.getHeight();
            double labelDownY = (outputFieldHeight - labelHeight) / 2;
            double x = padding.getLeft();
            positionChildren(getChildren().get(i), x, y + labelDownY);
            double x1=padding.getLeft()+labelMaxWidth;
            positionChildren(getChildren().get(i+1), x1, y + labelDownY);
            y = y + Math.max(viewBounds.getHeight(), labelBounds.getHeight()) + rowGap;

            //
        }

        //placing the inputField
        y = padding.getTop();
        for (int i = 2; i < getChildren().size(); i = i + 3) {
            Bounds viewBounds = getChildren().get(i).getLayoutBounds();
            double x = labelMaxWidth+5;
            positionChildren(getChildren().get(i), x, y);
            y = y + viewBounds.getHeight() + rowGap;
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

