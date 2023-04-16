package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.LoginView;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

import java.io.IOException;

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