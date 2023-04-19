package com.example.bankmanagment_version02.ui.customlayouts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface CommonFormViewModel {
    String getDoneButtonLabel();

    HashMap<String, Object> saveFormData();

    void onDone();

    HashMap<String, Double> getInputFieldWidths();

    HashMap<String, Double> getInputFieldHeights();

    LinkedHashMap<String, InputField> labelList();
}


