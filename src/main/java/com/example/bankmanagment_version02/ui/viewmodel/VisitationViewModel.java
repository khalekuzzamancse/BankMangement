package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.Snackbar;
import library.CommonFormViewModel;
import library.inputype.FormInputField;
import library.inputype.ImageInputField;
import library.inputype.InputField;
import library.inputype.TextFieldInputField;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class VisitationViewModel implements CommonFormViewModel {
    private final HashMap<String, Object> formData;

    private static final Labels labels = new LabelsImpl();

    public VisitationViewModel() {
        formData = new HashMap<>();


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
    public LinkedHashMap<String, InputField> getLabelList() {
        LinkedHashMap<String, InputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.ACCOUNT_NO, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.BOX_KEY, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.SIGNATURE,FormInputField.getInstance().getSignatureInputField());
        labelMap.put(labels.ATTENDEE_SIGNATURE,FormInputField.getInstance().getSignatureInputField());
        labelMap.put(labels.AS_DEPUTY, FormInputField.getInstance().getCheckBoxField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String ACCOUNT_NO = "Account No";
        String BOX_KEY = "Box Key";
        String AS_DEPUTY = "As Deputy";
        String SIGNATURE = "Signature";
        String ATTENDEE_SIGNATURE = "Attendee Signature";
    }

    private static class LabelsImpl implements Labels {
    }
}
