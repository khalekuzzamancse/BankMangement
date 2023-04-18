package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AccountModel;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CreateAccountFromViewModel implements FormViewModel {
    private final HashMap<String, String> formData;
    private AccountModel model;

    public CreateAccountFromViewModel() {
        formData = new HashMap<>();
        model=new AccountModel();
    }

    @Override
    public List<String> getLabelList() {
        return Arrays.asList("Name", "Email", "Phone Number", "Address", "Firm", "Hair Color", "Eye Color", "Height", "Weight");
    }

    @Override
    public String getDoneButtonLabel() {
        return "Add";
    }

    @Override
    public HashMap<String, String> saveFormData() {
        return formData;
    }

    @Override
    public void onDone() {
        model=new AccountModel(
                formData.get("Name"),
                formData.get("Email"),
                formData.get("Phone Number"),
                formData.get("Address"),
                formData.get("Firm"),
                formData.get("Hair Color"),
                formData.get("Eye Color"),
                Double.parseDouble(formData.get("Height")),
                Double.parseDouble(formData.get("Weight"))
                );
        Snackbar.show("Sucess");
        System.out.println(model);
    }
}
