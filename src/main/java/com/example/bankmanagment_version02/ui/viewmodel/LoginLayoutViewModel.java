package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.SnackBar;
import library.AbstractFormViewModel;
import library.inputype.InputField;
import library.inputype.TextFieldInputField;

import java.util.LinkedHashMap;

public class LoginLayoutViewModel extends AbstractFormViewModel {
    private static final Labels labels = new LabelsImpl();

    public LoginLayoutViewModel() {
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
        labelMap.put(labels.USER_NAME, new TextFieldInputField());
        labelMap.put(labels.PASSWORD, new TextFieldInputField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String USER_NAME = "User Name";
        String PASSWORD = "Password";
    }

    private static class LabelsImpl implements Labels {
    }
}
