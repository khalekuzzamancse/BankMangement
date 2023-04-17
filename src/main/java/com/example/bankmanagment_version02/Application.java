package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.FlexForm;
import com.example.bankmanagment_version02.ui.screens.LoginView;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {


//        stage = StageFactory.createStage(new LoginView().getLayout(), "Login", 400, 300);
//        stage.show();

        TextField textField = new TextField();
        textField.setPrefWidth(50); // set the desired width
        textField.setPrefHeight(50); // set the desired height
        FlexForm customLayout = new FlexForm();
        customLayout.getChildren().addAll(
                new Label("User Name"),
                textField, // add the custom-sized TextField
                new Label("Passwordhhhhh"),
                new TextField()
        );
        customLayout.setInputFieldSize(3, 200, 50);
        Pane root = new Pane();
        root.getChildren().add(customLayout);
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}