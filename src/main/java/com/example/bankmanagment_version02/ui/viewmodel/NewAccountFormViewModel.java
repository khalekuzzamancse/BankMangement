package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.ui.customlayouts.ImageInputField;
import com.example.bankmanagment_version02.ui.customlayouts.InputField;
import com.example.bankmanagment_version02.ui.customlayouts.TextFieldInputField;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NewAccountFormViewModel implements CommonFormViewModel {
    private final HashMap<String, Object> formData;
    private final HashMap<String, Double> inputFieldWidths;
    private final HashMap<String, Double> inputFieldHeights;
    private static final Labels labels = new LabelsImpl();

    public NewAccountFormViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        inputFieldHeights = new HashMap<>();
        //
        //   inputFieldHeights.put(labels.DEPUTY_NAME, 100.0);

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
        labelMap.put(labels.NAME, new TextFieldInputField());
        labelMap.put(labels.EMAIL, new TextFieldInputField());
        labelMap.put(labels.PHONE_NO, new TextFieldInputField());
        labelMap.put(labels.ADDRESS, new TextFieldInputField());
        labelMap.put(labels.FIRM, new TextFieldInputField());
        labelMap.put(labels.HAIR_COLOR, new TextFieldInputField());
        labelMap.put(labels.EYE_COLOR, new TextFieldInputField());
        labelMap.put(labels.HEIGHT, new TextFieldInputField());
        labelMap.put(labels.WEIGHT, new TextFieldInputField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String NAME = "Name";
        String EMAIL = "Email";
        String PHONE_NO = "Phone Number";
        String ADDRESS = "Address";
        String FIRM = "Firm";
        String HAIR_COLOR = "Hair Color";
        String EYE_COLOR = "Eye Color";
        String HEIGHT = "Height";
        String WEIGHT = "Weight";
    }

    private static class LabelsImpl implements Labels {
    }
}
