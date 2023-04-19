package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.*;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) {


        //   new LeaseScreen().getWindow().show();
         //new AddAccountScreen() .getWindow().show();
        //    new AddBoxScreen().getWindow().show();
        //new LoginScreen().getWindow().show();
       // new SendMailScreen().getWindow().show();
   //     new VisitationScreen().getWindow().show();
     new ViewLeaseInfoScreen().getWindow().show();
//        Label label = new Label("This is a long text fsdfafafaf to be wrapped in JavaFX.");
//        label.setWrapText(true);
//        label.setPrefWidth(1000);
//        StackPane root = new StackPane();
//        root.getChildren().add(label);
//
//        Scene scene = new Scene(root, 300, 250);
//
//        primaryStage.setTitle("JavaFX  Text Example");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        Bounds labelBounds = label.getLayoutBounds();
//        double labelHeight = labelBounds.getHeight();
//        System.out.println("Label height: " + labelHeight);
    }

    public static void main(String[] args) {
        launch();
    }


}