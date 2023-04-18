package com.example.bankmanagment_version02.ui.viewmodel;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface HetarogenousFormVIewModel extends FormViewModel{
    HashMap<Integer, Double> getInputFieldWidths();
    HashMap<Integer, Double> getInputFieldHeights();
    LinkedHashMap<String,InputFieldType> labelList();
}
