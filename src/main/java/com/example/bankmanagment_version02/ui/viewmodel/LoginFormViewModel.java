package com.example.bankmanagment_version02.ui.viewmodel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LoginFormViewModel implements FormViewModel {
    private HashMap<String, String> inputFieldValue;

    public LoginFormViewModel() {
        inputFieldValue = new HashMap<>();
    }

    @Override
    public List<String> getLabelList() {
        return Arrays.asList("User Name", "Password");
    }

    @Override
    public String getDoneButtonLabel() {
        return "Login";
    }

    @Override
    public HashMap<String, String> getFormData() {
        return   inputFieldValue;
    }

    public void onDone() {
        System.out.println(inputFieldValue);
    }

    public HashMap<String, String> setInputFieldValue() {
        return inputFieldValue;
    }
}
