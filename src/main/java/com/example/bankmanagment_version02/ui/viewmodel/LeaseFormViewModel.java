package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.*;

public class LeaseFormViewModel implements HetarogenousFormVIewModel {
    private final HashMap<String, Object> formData;
    private final HashMap<String, Double> inputFieldWidths;
    private final HashMap<String, Double> inputFieldHeights;
    private static final Labels labels = new LabelsImpl();


    public LeaseFormViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        inputFieldHeights = new HashMap<>();
        //
        //  inputFieldHeights.put(labels.DEPUTY_NAME,100.0);

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
        LinkedHashMap<String, InputFieldType> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.ACCOUNT_NO, InputFieldType.TextField);
        labelMap.put(labels.BOX_TYPE, InputFieldType.TextField);
        labelMap.put(labels.DURATION_MONTH, InputFieldType.TextField);
        labelMap.put(labels.DEPUTY_NAME, InputFieldType.TextField);
        labelMap.put(labels.DEPUTY_PHONE_NO, InputFieldType.TextField);
        labelMap.put(labels.DEPUTY_ADDRESS, InputFieldType.TextField);
        labelMap.put(labels.CUSTOMER_SIGNATURE, InputFieldType.ImageView);
        labelMap.put(labels.DEPUTY_SIGNATURE, InputFieldType.ImageView);
        labelMap.put(labels.ATTENDEE_SIGNATURE, InputFieldType.ImageView);
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String ACCOUNT_NO = "Account No";
        String BOX_TYPE = "Box Type";
        String DURATION_MONTH = "Duration(Month)";
        String DEPUTY_NAME = "Deputy Name";
        String DEPUTY_PHONE_NO = "Deputy Phone No";
        String DEPUTY_ADDRESS = "Deputy Address";
        String CUSTOMER_SIGNATURE = "Customer Signature";
        String DEPUTY_SIGNATURE = "Deputy Signature";
        String ATTENDEE_SIGNATURE = "Attendee Signature";
    }

    private static class LabelsImpl implements Labels {
    }
}
