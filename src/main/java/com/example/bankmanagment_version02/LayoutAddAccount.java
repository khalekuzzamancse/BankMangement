package com.example.bankmanagment_version02;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LayoutAddAccount {

    private final VBox vbox;

    LayoutAddAccount() {
        vbox = new VBox();
        FormLayout customLayout = new FormLayout();
        customLayout.getChildren().addAll(
                new Label("User Name"),
                new TextField(),
                new Label("Password"),
                new TextField()
        );
        Button button = new Button("Login");
        vbox.getChildren().addAll(customLayout, button);
    }

    public VBox getLayout() {
        return vbox;
    }
}
