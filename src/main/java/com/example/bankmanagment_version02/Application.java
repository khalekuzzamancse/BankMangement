package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.screens.*;
import com.example.bankmanagment_version02.ui.viewmodel.AccountListViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import com.example.bankmanagment_version02.utils.Windows;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        //    stage = StageFactory.createStage(new ViewScreen<>(new AccountListViewModel()), "Add Account Screen", 600, 700);
        //   stage.show();
        Windows.getInstance().boxListWindow().show();
        Windows.getInstance().accountListWindow().show();



    }

    public static void main(String[] args) {
        launch();
    }


}