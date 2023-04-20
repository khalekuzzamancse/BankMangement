package library;

import library.inputype.InputField;

import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class AbstractFormViewModel {
    protected final HashMap<String, Object> formData;
    public AbstractFormViewModel() {
        formData = new HashMap<>();
    }
    public HashMap<String, Object> saveFormData() {
        return formData;
    }
    public abstract void onDone();
    public abstract LinkedHashMap<String, InputField> getLabelList();
}
