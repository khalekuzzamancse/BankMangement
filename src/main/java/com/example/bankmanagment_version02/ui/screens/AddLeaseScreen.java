package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AddAccountFormLayoutViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.AddLeaseFormLayoutViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import library.CommonFormLayoutViewModel;
import library.layouts.BaseFromLayout;
import library.LabelToFormLayout;
import library.layouts.CustomAction;

public class AddLeaseScreen extends BaseFormScreen {
    public AddLeaseScreen() {
        super("Add Account Screen", new AddLeaseFormLayoutViewModel());
    }

}
