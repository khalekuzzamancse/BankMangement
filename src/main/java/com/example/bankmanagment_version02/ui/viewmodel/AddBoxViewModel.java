package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AddBoxModel;
import com.example.bankmanagment_version02.utils.SnackBar;
import library.AbstractFormViewModel;
import library.inputype.InputField;
import library.inputype.TextFieldInputField;

import java.util.LinkedHashMap;

public class AddBoxViewModel extends AbstractFormViewModel {

    private static final Labels labels = new LabelsImpl();


    @Override
    public void onDone() {
        SnackBar.show("Success");
        try {
            String serialNo = (String) formData.get(labels.SERIAL_NO);
            Double width = Double.parseDouble((String) formData.get(labels.WIDTH));
            Double height = Double.parseDouble((String) formData.get(labels.HEIGHT));
            Double oldPrice = Double.parseDouble((String) formData.get(labels.OLD_PRICE));
            Double newPrice = Double.parseDouble((String) formData.get(labels.NEW_PRICE));
            AddBoxModel boxModel = new AddBoxModel(serialNo, height, width, oldPrice, newPrice);
            System.out.println(boxModel);
        } catch (NumberFormatException e) {
            // handle the exception here
        }

    }

    @Override
    public LinkedHashMap<String, InputField> getLabelList() {
        LinkedHashMap<String, InputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.SERIAL_NO, new TextFieldInputField());
        labelMap.put(labels.WIDTH, new TextFieldInputField());
        labelMap.put(labels.HEIGHT, new TextFieldInputField());
        labelMap.put(labels.OLD_PRICE, new TextFieldInputField());
        labelMap.put(labels.NEW_PRICE, new TextFieldInputField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String SERIAL_NO = "Serial Number";
        String HEIGHT = "Height";
        String WIDTH = "Width";
        String OLD_PRICE = "Old Price";
        String NEW_PRICE = "New Price";
    }

    private static class LabelsImpl implements Labels {
    }
}
