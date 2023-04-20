package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.*;
import com.example.bankmanagment_version02.ui.viewmodel.SendExpireMailViewModel;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) {

//        Stage window;
//        window = new AddAccountScreen().getWindow();
//        window.show();
        new AddBoxScreen().getWindow().show();
//        new LoginScreen().getWindow().show();
//        new SendMailScreen().getWindow().show();
//        new SendExpireMailScreen().getWindow().show();
//        new VisitationScreen().getWindow().show();
//        new ViewLeaseInfoScreen().getWindow().show();


    }

    public static void main(String[] args) {
        launch();
    }


}