package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.ui.viewmodel.AddBoxViewModel;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Snackbar;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AddBoxScreen extends VBox {
    private final AddBoxViewModel viewModel;
    private final VBox vbox;

    public AddBoxScreen() {
        this.viewModel = new AddBoxViewModel();
        createView();
        vbox = this;
        setSpacing(20);
    }

    private void createView() {

        DynamicSizeFromLayout customLayout = new DynamicSizeFromLayout();
        customLayout.getChildren().addAll(
                new Label("Serial No"), new TextField(),
                new Label("Height (inch)"), new TextField(),
                new Label("Width (inch)"), new TextField(),
                new Label("Old Price"), new TextField(),
                new Label("New Price"), new TextField()
        );
        Button button = new Button("Add");
        button.setOnAction(event -> {
            TextField serialNoTextField = (TextField) customLayout.getChildren().get(1);
            TextField heightTextField = (TextField) customLayout.getChildren().get(3);
            TextField widthTextField = (TextField) customLayout.getChildren().get(5);
            TextField oldPriceTextField = (TextField) customLayout.getChildren().get(7);
            TextField newPriceTextField = (TextField) customLayout.getChildren().get(9);

            viewModel.setSerialNumber(serialNoTextField.getText());
            viewModel.setHeight(heightTextField.getText());
            viewModel.setWidth(widthTextField.getText());
            viewModel.setOldPrice(oldPriceTextField.getText());
            viewModel.setNewPrice(newPriceTextField.getText());

            if (viewModel.isValidBox()) {
                // Perform some action
                viewModel.addBox();
                Snackbar.show("Box Added Successfully", this);
            } else {
                Snackbar.show("Invalid Box Details", this);
            }
        });
        this.getChildren().addAll(customLayout, button);
        this.getStyleClass().add("add-box-view");
    }

    public VBox getLayout() {
        return vbox;
    }

    @Override
    public void resize(double width, double height) {
        double padding = 5;
        double layoutHeight = 0;
        double layoutWidth = 0;
        for (Node child : getChildren()) {
            layoutHeight = layoutHeight + child.getBoundsInParent().getHeight() + padding;
            layoutWidth = Math.max(layoutWidth, child.getBoundsInParent().getWidth()) + padding;
        }

        super.resize(layoutWidth, layoutHeight); // set fixed width and height
        LayoutUtil.alignCenter(this, getChildren());
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        LayoutUtil.alignCenter(this, getChildren());
    }
}
