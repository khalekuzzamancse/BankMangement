package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AddAccountFormLayoutViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.VisitationLayoutViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import library.*;
import library.layouts.BaseFromLayout;
import library.layouts.CustomAction;

public class VisitationScreen extends BaseFormScreen {
    public VisitationScreen() {
        super("Visitation Screen", new VisitationLayoutViewModel());
    }

}
