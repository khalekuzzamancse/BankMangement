package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AddAccountModel;
import com.example.bankmanagment_version02.data.model.AddBoxModel;
import library.AbstractFormViewModel;
import library.inputype.FormInputField;
import library.inputype.InputField;
import com.example.bankmanagment_version02.utils.SnackBar;

import java.util.LinkedHashMap;

public class AddAccountFormViewModel extends AbstractFormViewModel {
    private static final Labels labels = new LabelsImpl();

    public AddAccountFormViewModel() {
        super();

    }

    @Override
    public void onDone() {

        try {
            String name = (String) formData.get(labels.NAME);
            String email = (String) formData.get(labels.EMAIL);
            String phoneNo = (String) formData.get(labels.PHONE_NO);
            String address = (String) formData.get(labels.ADDRESS);
            String firm = (String) formData.get(labels.FIRM);
            String eyeColor = (String) formData.get(labels.EYE_COLOR);
            String hairColor = (String) formData.get(labels.HAIR_COLOR);
            Double weight = Double.parseDouble((String) formData.get(labels.WEIGHT));
            Double height = Double.parseDouble((String) formData.get(labels.HEIGHT));
            AddAccountModel accountModel =
                    new AddAccountModel(name, email, phoneNo, address, firm, hairColor,eyeColor, height,weight);
            System.out.println(accountModel);
        } catch (Exception e) {
            SnackBar.show("Failed to add,Check the field");
        }
    }


    @Override
    public LinkedHashMap<String, InputField> getLabelList() {
        LinkedHashMap<String, InputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.NAME, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.EMAIL, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.PHONE_NO, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.ADDRESS, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.FIRM, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.HAIR_COLOR, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.EYE_COLOR, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.HEIGHT, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.WEIGHT, FormInputField.getInstance().getTextInputField());
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String NAME = "Name";
        String EMAIL = "Email";
        String PHONE_NO = "Phone Number";
        String ADDRESS = "Address";
        String FIRM = "Firm";
        String HAIR_COLOR = "Hair Color";
        String EYE_COLOR = "Eye Color";
        String HEIGHT = "Height";
        String WEIGHT = "Weight";
    }

    private static class LabelsImpl implements Labels {
    }
}
