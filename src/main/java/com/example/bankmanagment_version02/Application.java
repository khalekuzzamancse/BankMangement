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
//        String[] columnNames = {"Name", "Age", "Gender"};
//
//        // create some dummy data
//        ObservableList<Person> data = FXCollections.observableArrayList(
//                new Person("John", 25, "Male"),
//                new Person("Jane", 30, "Female"),
//                new Person("Bob", 40, "Male")
//        );
//
//        CustomTable<Person> table = new CustomTable<>(columnNames, data);
//
//        StackPane root = new StackPane();
//        root.getChildren().add(table);
//
//        Scene scene = new Scene(root, 400, 400);
//
//        stage.setScene(scene);
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