package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.CreateBoxFormModel;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SendMailFromViewModel implements HetarogenousFormVIewModel {
    private final HashMap<String, String> formData;
    private final HashMap<Integer, Double> inputFieldWidths;
    private final HashMap<Integer, Double> inputFieldHeights;

    public SendMailFromViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        //
        inputFieldWidths.put(5, 300.0);
        inputFieldHeights = new HashMap<>();

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

    @Override
    public HashMap<Integer, Double> getInputFieldWidths() {
        return inputFieldWidths;
    }

    @Override
    public HashMap<Integer, Double> getInputFieldHeights() {
        return inputFieldHeights;
    }
}
