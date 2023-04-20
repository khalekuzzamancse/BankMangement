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


        //new AddAccountScreen().getWindow().show();
        //new AddBoxScreen().getWindow().show();
//        new LoginScreen().getWindow().show();
      //  new SendMailScreen().getWindow().show();
//        new SendExpireMailScreen().getWindow().show();
//        new VisitationScreen().getWindow().show();
//        new ViewLeaseInfoScreen().getWindow().show();
        new AddLeaseScreen().getWindow().show();


    }

    public static void main(String[] args) {
        launch();
    }


}