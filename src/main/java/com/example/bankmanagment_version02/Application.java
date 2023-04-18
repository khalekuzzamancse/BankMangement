package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.*;
import com.example.bankmanagment_version02.utils.Windows;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    HomogenousInputFieldFormLayout form;

    @Override
    public void start(Stage stage) {

//        Windows.getInstance().boxListWindow().show();
//        Windows.getInstance().accountListWindow().show();
     new  LoginScreen().getWindow().show();
        new CreateAccountScreen().getWindow().show();

    }

    public static void main(String[] args) {
        launch();
    }


}