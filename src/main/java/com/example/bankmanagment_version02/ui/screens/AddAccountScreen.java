package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.VisitationLayoutViewModel;
import library.CommonFormLayoutViewModel;
import library.layouts.BaseFromLayout;
import library.LabelToFormLayout;
import library.layouts.CustomAction;
import com.example.bankmanagment_version02.ui.viewmodel.AddAccountFormLayoutViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddAccountScreen extends BaseFormScreen {
    public AddAccountScreen() {
        super("Add Account Screen", new AddAccountFormLayoutViewModel());
    }



}
