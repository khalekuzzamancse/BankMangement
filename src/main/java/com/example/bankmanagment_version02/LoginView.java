package com.example.bankmanagment_version02;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
    private final LoginViewModel viewModel;
    private final VBox vbox;

    public LoginView() {
        this.viewModel = new LoginViewModel();
        createView();
        vbox = this;
        setPrefSize(350, 350);
        setStyle("-fx-background-color: #29ACD4;");
    }

    private void createView() {
        FormLayout customLayout = new FormLayout();
        customLayout.getChildren().addAll(
                new Label("User Name"),
                new TextField(),
                new Label("Password"),
                new TextField()
        );
        Button button = new Button("Login");
        button.setOnAction(event -> {
            TextField userNameTextField = (TextField) customLayout.getChildren().get(1);
            TextField passwordTextField = (TextField) customLayout.getChildren().get(3);
            viewModel.setUserName(userNameTextField.getText());
            viewModel.setPassword(passwordTextField.getText());
            if (viewModel.isValidUser()) {
                // Navigate to the next screen or perform some other action
               Snackbar.show("Successfully",this);
            } else {
                Snackbar.show("User Name or Password is wrong",this);
            }
        });
        this.getChildren().addAll(customLayout, button);
        this.setAlignment(Pos.CENTER);
    }

    public VBox getLayout() {
        return vbox;
    }
}
