package com.example.bankmanagment_version02.ui.viewmodel;

import java.util.HashMap;
import java.util.List;

public interface FormViewModel {
    List<String> getLabelList();
    String getDoneButtonLabel();
      HashMap<String,String> saveFormData();
    void  onDone();

}
