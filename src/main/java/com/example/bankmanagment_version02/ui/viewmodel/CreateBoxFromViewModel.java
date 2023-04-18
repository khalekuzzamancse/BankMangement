package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.CreateBoxFormModel;
import com.example.bankmanagment_version02.utils.Snackbar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CreateBoxFromViewModel implements FormViewModel {
    private final HashMap<String, String> formData;
    private CreateBoxFormModel model;

    public CreateBoxFromViewModel() {
        formData = new HashMap<>();
        model=new CreateBoxFormModel();
    }

    @Override
    public List<String> getLabelList() {
        return Arrays.asList("Serial Number", "Height", "Width", "Old Price", "New Price");
    }

    @Override
    public String getDoneButtonLabel() {
        return "Add";
    }

    @Override
    public HashMap<String, String> saveFormData() {
        return formData;
    }

    @Override
    public void onDone() {
        model=new CreateBoxFormModel(
                formData.get("Serial Number"),
                Double.parseDouble(formData.get("Height")),
                Double.parseDouble(formData.get("Width")),
                Double.parseDouble(formData.get("Old Price")),
                Double.parseDouble(formData.get("New Price"))
                );
        Snackbar.show("Sucess");
        System.out.println(model);
    }
}
