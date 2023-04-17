package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
//        stage = StageFactory.createStage(new AddBoxScreen().getLayout(), "Add Account Screen", 600, 700);
//        stage.show();


        ViewInfo layout = new ViewInfo();
        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.setTitle("CustomTable Example");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}