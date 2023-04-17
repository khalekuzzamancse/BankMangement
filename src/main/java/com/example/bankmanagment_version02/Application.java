package com.example.bankmanagment_version02;

import com.example.bankmanagment_version02.ui.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.ui.screens.*;
import com.example.bankmanagment_version02.ui.viewmodel.AccountListViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import com.example.bankmanagment_version02.utils.Windows;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Application extends javafx.application.Application {
    GenericForm form;

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