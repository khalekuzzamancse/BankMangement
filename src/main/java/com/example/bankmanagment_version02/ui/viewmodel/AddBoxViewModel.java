package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.Snackbar;
import library.CommonFormViewModel;
import library.inputype.InputField;
import library.inputype.TextFieldInputField;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AddBoxViewModel implements CommonFormViewModel {
    private final HashMap<String, Object> formData;
    private final HashMap<String, Double> inputFieldWidths;
    private final HashMap<String, Double> inputFieldHeights;
    private static final Labels labels = new LabelsImpl();

    public AddBoxViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        inputFieldHeights = new HashMap<>();

    }

    @Override
    public HashMap<String, Object> saveFormData() {
        return formData;
    }

    @Override
    public void onDone() {
        Snackbar.show("Success");
        System.out.println("Form Data:" + formData);
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
    public LinkedHashMap<String, InputField> getLabelList() {
        LinkedHashMap<String, InputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.SERIAL_NO, new TextFieldInputField());
        labelMap.put(labels.WIDTH, new TextFieldInputField());
        labelMap.put(labels.HEIGHT, new TextFieldInputField());
        labelMap.put(labels.OLD_PRICE, new TextFieldInputField());
        labelMap.put(labels.NEW_PRICE, new TextFieldInputField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String SERIAL_NO = "Serial Number";
        String HEIGHT = "Height";
        String WIDTH = "Width";
        String OLD_PRICE = "Old Price";
        String NEW_PRICE = "New Price";
    }

    private static class LabelsImpl implements Labels {
    }
}
