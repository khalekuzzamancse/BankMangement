package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.*;
import com.example.bankmanagment_version02.utils.Windows;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    HomogenousInputFieldForm form;

    @Override
    public void start(Stage stage) {

//        Windows.getInstance().boxListWindow().show();
//        Windows.getInstance().accountListWindow().show();
        Windows.getInstance().genericFormWindow().show();

    }

    public static void main(String[] args) {
        launch();
    }


}