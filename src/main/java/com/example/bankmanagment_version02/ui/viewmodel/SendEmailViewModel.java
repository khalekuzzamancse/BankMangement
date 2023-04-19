package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.Snackbar;
import library.CommonFormViewModel;
import library.HeterogeneousFormViewModel;
import library.inputype.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SendEmailViewModel implements HeterogeneousFormViewModel {
    private final HashMap<String, Object> formData;
    private final HashMap<String, Double> inputFieldWidths;
    private final HashMap<String, Double> inputFieldHeights;
    private static final Labels labels = new LabelsImpl();

    public SendEmailViewModel() {
        formData = new HashMap<>();
        inputFieldWidths = new HashMap<>();
        inputFieldHeights = new HashMap<>();
        inputFieldWidths.put(labels.MESSAGE, 200.0);
        inputFieldHeights.put(labels.MESSAGE, 150.0);
        inputFieldWidths.put(labels.SUBJECT, 200.0);


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
        labelMap.put(labels.ACCOUNT_NO, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.SUBJECT, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.MESSAGE, FormInputField.getInstance().getTextAreaInputField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String ACCOUNT_NO = "Account No";
        String SUBJECT = "Subject";
        String MESSAGE = "Message";
    }

    private static class LabelsImpl implements Labels {
    }
}
