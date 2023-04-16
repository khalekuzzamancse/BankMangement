package com.example.bankmanagment_version02;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {


//        Pane root = new Pane();
//        root.getChildren().add(new LoginView().getLayout());
//        LoginView layout = new LoginView();
        //  Scene scene = new Scene(root, 400, 400);
        // stage.setScene(scene);
        stage = StageFactory.createStage(new LoginView().getLayout(), "Login", 400, 300);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }


}