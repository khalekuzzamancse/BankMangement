package com.example.bankmanagment_version02.ui.viewmodel;

import library.ImageInputField;
import library.InputField;
import library.TextFieldInputField;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.*;

public class LeaseFormViewModel implements CommonFormViewModel {
    private final HashMap<String, Object> formData;
    private final HashMap<String, Double> inputFieldWidths;
    private final HashMap<String, Double> inputFieldHeights;
    private static final Labels labels = new LabelsImpl();

    public LeaseFormViewModel() {
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
        System.out.println("Form Data:"+formData);
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
        labelMap.put(labels.ACCOUNT_NO, new TextFieldInputField());
        labelMap.put(labels.BOX_TYPE, new TextFieldInputField());
        labelMap.put(labels.DURATION_MONTH, new TextFieldInputField());
        labelMap.put(labels.DEPUTY_NAME, new TextFieldInputField());
        labelMap.put(labels.DEPUTY_PHONE_NO, new TextFieldInputField());
        labelMap.put(labels.DEPUTY_ADDRESS, new TextFieldInputField());
        labelMap.put(labels.CUSTOMER_SIGNATURE, new ImageInputField());
        labelMap.put(labels.DEPUTY_SIGNATURE, new ImageInputField());
        labelMap.put(labels.ATTENDEE_SIGNATURE, new ImageInputField());
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
