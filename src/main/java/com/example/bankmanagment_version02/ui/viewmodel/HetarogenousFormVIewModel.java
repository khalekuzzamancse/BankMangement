package com.example.bankmanagment_version02.ui.viewmodel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public interface HetarogenousFormVIewModel {


    String getDoneButtonLabel();

    HashMap<String, Object> saveFormData();

    void onDone();

    HashMap<String, Double> getInputFieldWidths();

    HashMap<String, Double> getInputFieldHeights();

    LinkedHashMap<String, InputFieldType> labelList();
}
