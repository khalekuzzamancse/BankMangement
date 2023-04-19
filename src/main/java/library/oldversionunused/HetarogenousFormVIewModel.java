package library.oldversionunused;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface HetarogenousFormVIewModel {


    String getDoneButtonLabel();

    HashMap<String, Object> saveFormData();

    void onDone();

    HashMap<String, Double> getInputFieldWidths();

    HashMap<String, Double> getInputFieldHeights();

    LinkedHashMap<String, InputFieldType> labelList();
}
