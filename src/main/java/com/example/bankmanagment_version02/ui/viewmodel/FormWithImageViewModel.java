package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class FormWithImageViewModel implements HetarogenousFormVIewModel {
    private final HashMap<String, String> formData;
    private final HashMap<Integer, Double> inputFieldWidths;
    private final HashMap<Integer, Double> inputFieldHeights;

    public FormWithImageViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        //
        inputFieldHeights = new HashMap<>();

    }

    @Override
    public List<String> getLabelList() {
        return new ArrayList<>();
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

    @Override
    public LinkedHashMap<String, InputFieldType> labelList() {
        LinkedHashMap<String, InputFieldType> labels = new LinkedHashMap<>();
        labels.put("Signature", InputFieldType.ImageView);
        labels.put("Subject", InputFieldType.ImageView);
        labels.put("Message", InputFieldType.ImageView);
        return labels;
    }
}
