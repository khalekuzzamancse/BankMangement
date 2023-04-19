package library;

import library.inputype.InputField;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface CommonFormLayoutViewModel {
    HashMap<String, Object> saveFormData();

    void onDone();
    LinkedHashMap<String, InputField> getLabelList();
}


