package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.SnackBar;
import library.AbstractFormViewModel;
import library.inputype.*;

import java.util.LinkedHashMap;

public class SendEmailLayoutViewModel extends AbstractFormViewModel {
    private static final Labels labels = new LabelsImpl();

    public SendEmailLayoutViewModel() {
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
        labelMap.put(labels.ACCOUNT_NO, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.SUBJECT, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.MESSAGE, FormInputField.getInstance().getTextAreaInputField(200,100));
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
