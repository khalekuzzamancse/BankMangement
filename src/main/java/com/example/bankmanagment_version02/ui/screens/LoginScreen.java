package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AddAccountFormLayoutViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.AddBoxLayoutViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.LoginLayoutViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.*;
import library.layouts.BaseFromLayout;
import library.layouts.CustomAction;

public class LoginScreen extends BaseFormScreen {

    public LoginScreen() {
        super("Login Screen ", new LoginLayoutViewModel());
    }


}
