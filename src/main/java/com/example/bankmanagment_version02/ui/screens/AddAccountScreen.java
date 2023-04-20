package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AddAccountFormViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.AddLeaseFormLayoutViewModel;
import library.BaseFormScreen;

public class AddAccountScreen extends BaseFormScreen {
    public AddAccountScreen() {
        super("Add Account Screen", new AddAccountFormViewModel());
    }



}
