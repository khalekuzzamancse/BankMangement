package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.ui.screens.LoginScreen;
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


        stage = StageFactory.createStage(new LoginScreen().getLayout(), "Login Screen", 600, 400);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }


}