package com.example.bankmanagment_version02.ui.viewmodel;

import javafx.scene.image.Image;
import library.outputfield.OutputField;
import library.ViewFormViewModel;
import library.outputfield.OutputFieldFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ViewLeaseFormViewModel implements ViewFormViewModel {
    private final HashMap<String, Object> formData;

    private static final Labels labels = new LabelsImpl();

    public ViewLeaseFormViewModel() {
        formData = new HashMap<>();

        //
        //   inputFieldHeights.put(labels.DEPUTY_NAME, 100.0);

    }

    @Override
    public HashMap<String, Object> saveFormData() {
        return formData;
    }


    @Override
    public LinkedHashMap<String, OutputField> getLabelList() {
        LinkedHashMap<String, OutputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.ACCOUNT_NO, OutputFieldFactory.getInstance().getTextInputField("Hgdsftgsgsdgsdgsdgsggsgsgsgsgsdgsdgsggsgsdello"));
        labelMap.put(labels.BOX_TYPE, OutputFieldFactory.getInstance().getTextInputField("Hello"));
        labelMap.put(labels.DURATION_MONTH, OutputFieldFactory.getInstance().getTextInputField("Hello"));
        labelMap.put(labels.DEPUTY_NAME, OutputFieldFactory.getInstance().getTextInputField("Hello"));
        labelMap.put(labels.DEPUTY_PHONE_NO, OutputFieldFactory.getInstance().getTextInputField("Hello"));
        labelMap.put(labels.DEPUTY_ADDRESS, OutputFieldFactory.getInstance().getTextInputField("Hello"));
        labelMap.put(labels.CUSTOMER_SIGNATURE, OutputFieldFactory.getInstance().getImageOutPutField(new Image("signature_1.jpeg")));
        labelMap.put(labels.DEPUTY_SIGNATURE, OutputFieldFactory.getInstance().getImageOutPutField(new Image("signature_1.jpeg")));
        labelMap.put(labels.ATTENDEE_SIGNATURE, OutputFieldFactory.getInstance().getImageOutPutField(new Image("signature_1.jpeg")));
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String ACCOUNT_NO = "Account No";
        String BOX_TYPE = "Box Type";
        String DURATION_MONTH = "Duration";
        String DEPUTY_NAME = "Deputy Name";
        String DEPUTY_PHONE_NO = "Deputy Phone No";
        String DEPUTY_ADDRESS = "Deputy Address";
        String CUSTOMER_SIGNATURE = "Customer Signature";
        String DEPUTY_SIGNATURE = "Deputy Signature";
        String ATTENDEE_SIGNATURE = "Attendee Signature";
    }

    private static class LabelsImpl implements Labels {
    }
}
