package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.data.model.VisitationModelWithImage;
import com.example.bankmanagment_version02.ui.viewmodel.AddVisitationWithImageViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.VisitationLayoutViewModel;
import library.*;

public class VisitationScreen extends BaseFormScreen {
    public VisitationScreen() {
        //super("Visitation Screen", new VisitationLayoutViewModel());
        super("Visitation Screen", new AddVisitationWithImageViewModel());
    }

}
