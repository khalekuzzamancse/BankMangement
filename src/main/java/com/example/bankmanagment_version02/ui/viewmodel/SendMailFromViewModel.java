package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.CreateBoxFormModel;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SendMailFromViewModel implements FormViewModel {
    private final HashMap<String, String> formData;

    public SendMailFromViewModel() {
        formData = new HashMap<>();
    }

    @Override
    public List<String> getLabelList() {
        return Arrays.asList("User ID", "Subject", "Message");
    }

    @Override
    public String getDoneButtonLabel() {
        return "Send";
    }

    @Override
    public HashMap<String, String> saveFormData() {
        return formData;
    }

    @Override
    public void onDone() {

        Snackbar.show("Sucess");
        System.out.println(formData);
    }
}
