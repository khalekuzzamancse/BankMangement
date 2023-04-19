package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.ui.customlayouts.InputField;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface CommonFormViewModel {
    HashMap<String, Object> saveFormData();

    void onDone();

    HashMap<String, Double> getInputFieldWidths();

    HashMap<String, Double> getInputFieldHeights();

    LinkedHashMap<String, InputField> getLabelList();
}


