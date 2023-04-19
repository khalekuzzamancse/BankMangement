package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.LeaseScreen;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
//
//        Windows.getInstance().boxListWindow().show();
//        Windows.getInstance().accountListWindow().show();
//         new  LoginScreen().getWindow().show();
//              new CreateAccountScreen().getWindow().show();
//          new CreateBoxScreen().getWindow().show();
//      new SendMailScreen().getWindow().show();
        new LeaseScreen().getWindow().show();

    }

    public static void main(String[] args) {
        launch();
    }


}