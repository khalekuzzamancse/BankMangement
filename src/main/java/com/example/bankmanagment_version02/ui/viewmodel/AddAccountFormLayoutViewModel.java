package com.example.bankmanagment_version02.ui.viewmodel;

import library.AbstractFormViewModel;
import library.inputype.FormInputField;
import library.inputype.InputField;
import com.example.bankmanagment_version02.utils.SnackBar;

import java.util.LinkedHashMap;

public class AddAccountFormLayoutViewModel extends AbstractFormViewModel {
    private static final Labels labels = new LabelsImpl();

    public AddAccountFormLayoutViewModel() {
        super();

    }

    @Override
    public void onDone() {
        SnackBar.show("Success");
        System.out.println("Form Data:" + formData);
    }


    @Override
    public LinkedHashMap<String, InputField> getLabelList() {
        LinkedHashMap<String, InputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.NAME, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.EMAIL, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.PHONE_NO, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.ADDRESS, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.FIRM, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.HAIR_COLOR, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.EYE_COLOR, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.HEIGHT, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.WEIGHT, FormInputField.getInstance().getTextInputField());
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
