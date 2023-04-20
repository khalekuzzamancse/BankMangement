package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.utils.Snackbar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import library.CommonFormLayoutViewModel;
import library.inputype.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class VisitationLayoutViewModel implements CommonFormLayoutViewModel {
    private final HashMap<String, Object> formData;

    private static final Labels labels = new LabelsImpl();

    public VisitationLayoutViewModel() {
        formData = new HashMap<>();
    }

    InputFieldListener listener = node -> {
        ImageView imageView=(ImageView) node;
        imageView.setImage(new Image("signature_1.jpeg"));
    };

    @Override
    public HashMap<String, Object> saveFormData() {
        return formData;
    }

    @Override
    public void onDone() {
        Snackbar.show("Success");
        System.out.println("Visititaion Form Data:" + formData);
    }


    @Override
    public LinkedHashMap<String, InputField> getLabelList() {
        LinkedHashMap<String, InputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.ACCOUNT_NO, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.BOX_KEY, FormInputField.getInstance().getTextInputField());
        labelMap.put(labels.CURRENT_SIGNATURE, FormInputField.getInstance().getSignatureInputField());
        labelMap.put(labels.SIGNATURE, new ImageInputField("load.png", listener));
        labelMap.put(labels.ATTENDEE_SIGNATURE, FormInputField.getInstance().getSignatureInputField());
        labelMap.put(labels.AS_DEPUTY, FormInputField.getInstance().getCheckBoxField());
        labelMap.put(labels.DESCRIPTION, FormInputField.getInstance().getTextAreaInputField(200,150));
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String ACCOUNT_NO = "Account No";
        String BOX_KEY = "Box Key";
        String AS_DEPUTY = "As Deputy";
        String SIGNATURE = "Signature";
        String CURRENT_SIGNATURE = "Current Signature";
        String ATTENDEE_SIGNATURE = "Attendee Signature";
        String DESCRIPTION = "Description";
    }

    private static class LabelsImpl implements Labels {
    }
}
