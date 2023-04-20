package com.example.bankmanagment_version02.ui.viewmodel;

import library.AbstractFormViewModel;
import library.inputype.ImageInputField;
import library.inputype.InputField;
import library.inputype.TextFieldInputField;
import com.example.bankmanagment_version02.utils.SnackBar;

import java.util.*;

public class AddLeaseFormLayoutViewModel extends AbstractFormViewModel {

    private static final Labels labels = new LabelsImpl();

    public AddLeaseFormLayoutViewModel() {
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
        String DURATION_MONTH = "Duration";
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
