package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.LoginScreen;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {


        //   new LeaseScreen().getWindow().show();
        //    new NewAccountScreen().getWindow().show();
        //    new AddBoxScreen().getWindow().show();
        new LoginScreen().getWindow().show();

    }

    public static void main(String[] args) {
        launch();
    }


}