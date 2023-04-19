package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.LoginFormModel;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeaseFormViewModel implements FormViewModel {
    private final HashMap<String, String> formData;

    public LeaseFormViewModel() {
        formData = new HashMap<>();
    }

    @Override
    public List<String> getLabelList() {
        return Arrays.asList("Singanture", "Sig");
    }

    @Override
    public String getDoneButtonLabel() {
        return "Done";
    }

    @Override
    public HashMap<String, String> saveFormData() {
        return formData;
    }

    public void onDone() {

        Snackbar.show("Sucess");

    }
}
