package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.CreateBoxFormModel;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.*;

public class SendMailFromViewModel implements HetarogenousFormVIewModel {
    private final HashMap<String, Object> formData;
    private final HashMap<String, Double> inputFieldWidths;
    private final HashMap<String, Double> inputFieldHeights;

    public SendMailFromViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        //
        inputFieldWidths.put("Message", 300.0);
        inputFieldHeights = new HashMap<>();

    }

    @Override
    public String getDoneButtonLabel() {
        return "Send";
    }

    @Override
    public HashMap<String, Object> saveFormData() {
        return formData;
    }

    @Override
    public void onDone() {

        Snackbar.show("Sucess");
        System.out.println(formData);
    }

    @Override
    public HashMap<String, Double> getInputFieldWidths() {
        return inputFieldWidths;
    }

    @Override
    public HashMap<String, Double> getInputFieldHeights() {
        return inputFieldHeights;
    }

    @Override
    public LinkedHashMap<String, InputFieldType> labelList() {
        LinkedHashMap<String, InputFieldType> labels = new LinkedHashMap<>();
        labels.put("User ID", InputFieldType.TextField);
        labels.put("Subject", InputFieldType.TextField);
        labels.put("Message", InputFieldType.TextArea);
        return labels;
    }
}
