package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.repository.Reposititory;
import com.example.bankmanagment_version02.ui.screens.*;
import com.example.bankmanagment_version02.ui.viewmodel.SendExpireMailViewModel;
import datastorage.file.FileHandling;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) {

//        System.out.println(Reposititory.getAccounts());
//        System.out.println(Reposititory.getLeases());
//        System.out.println(Reposititory.getBoxes());
//        System.out.println(Reposititory.getVisitations());
        //   new AddAccountScreen().getWindow().show();
        //new AddBoxScreen().getWindow().show();
        // new LoginScreen().getWindow().show();
        //     new SendMailScreen().getWindow().show();
        //   new SendExpireMailScreen().getWindow().show();
     //     new VisitationScreen().getWindow().show();
        // new ViewLeaseInfoScreen().getWindow().show();
        // new AddLeaseScreen().getWindow().show();
        new InfoViewTableScreen();


    }

    public static void main(String[] args) {
        launch();
    }


}