package library.layouts;

import library.outputfield.OutputField;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface InfoViewFormLayoutViewModel {
    HashMap<String, Object> saveFormData();

    LinkedHashMap<String, OutputField> getLabelList();
}


