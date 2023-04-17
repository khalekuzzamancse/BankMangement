package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.utils.LayoutUtil;
import com.example.bankmanagment_version02.utils.Snackbar;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AddAccountScreen extends VBox {
    private final AddAccountViewModel viewModel;
    private final VBox vbox;

    public AddAccountScreen() {
        this.viewModel = new AddAccountViewModel();
        createView();
        vbox = this;
        setSpacing(20);
    }

    private void createView() {

        DynamicSizeFromLayout customLayout = new DynamicSizeFromLayout();
        customLayout.getChildren().addAll(
                new Label("Name"), new TextField(),
                new Label("Email"), new TextField(),
                new Label("Phone No"), new TextField(),
                new Label("Address"), new TextField(),
                new Label("Firm"), new TextField(),
                new Label("Hair Color"), new TextField(),
                new Label("Eye Color"), new TextField(),
                new Label("Height"), new TextField(),
                new Label("Weight"), new TextField()
        );
        Button button = new Button("Add");
        button.setOnAction(event -> {
            TextField nameTextField = (TextField) customLayout.getChildren().get(1);
            TextField emailTextField = (TextField) customLayout.getChildren().get(3);
            TextField phoneNoTextField = (TextField) customLayout.getChildren().get(5);
            TextField addressTextField = (TextField) customLayout.getChildren().get(7);
            TextField firmTextField = (TextField) customLayout.getChildren().get(9);
            TextField hairColorTextField = (TextField) customLayout.getChildren().get(11);
            TextField eyeColorTextField = (TextField) customLayout.getChildren().get(13);
            TextField heightTextField = (TextField) customLayout.getChildren().get(15);
            TextField weightTextField = (TextField) customLayout.getChildren().get(17);

            viewModel.setName(nameTextField.getText());
            viewModel.setEmail(emailTextField.getText());
            viewModel.setPhoneNo(phoneNoTextField.getText());
            viewModel.setAddress(addressTextField.getText());
            viewModel.setFirm(firmTextField.getText());
            viewModel.setHairColor(hairColorTextField.getText());
            viewModel.setEyeColor(eyeColorTextField.getText());
            viewModel.setHeight(heightTextField.getText());
            viewModel.setWeight(weightTextField.getText());

            // Handle the addition of the account here
            viewModel.addAccount();
            Snackbar.show("Successfully added account", this);
        });
        this.getChildren().addAll(customLayout, button);
        this.getStyleClass().add("add-account-view");
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

