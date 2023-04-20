package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.AddAccountModel;
import com.example.bankmanagment_version02.data.model.VisitationModel;
import com.example.bankmanagment_version02.utils.SnackBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import library.AbstractFormViewModel;
import library.inputype.*;

import java.util.LinkedHashMap;

public class VisitationLayoutViewModel extends AbstractFormViewModel {


    private static final Labels labels = new LabelsImpl();

    public VisitationLayoutViewModel() {
        super();
    }

    InputFieldListener listener = node -> {
        ImageView imageView = (ImageView) node;
        imageView.setImage(new Image("signature_1.jpeg"));
    };

    @Override
    public void onDone() {
        try {
// get form data values using label constants
            String accountNo = (String) formData.get(labels.ACCOUNT_NO);
            String boxKey = (String) formData.get(labels.BOX_KEY);
            Boolean asDeputy = (Boolean) formData.get(labels.AS_DEPUTY);
            Image signature = (Image) formData.get(labels.SIGNATURE);
            Image currentSignature = (Image) formData.get(labels.CURRENT_SIGNATURE);
            Image attendeeSignature = (Image) formData.get(labels.ATTENDEE_SIGNATURE);
            String description = (String) formData.get(labels.DESCRIPTION);
// create Account object and set properties
            VisitationModel visitationModel =
                    new VisitationModel(accountNo, boxKey, asDeputy,
                            signature, attendeeSignature, description);
            System.out.println(visitationModel);

        } catch (Exception e) {
            SnackBar.show("Failed to add,Check the field");
        }

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
        labelMap.put(labels.DESCRIPTION, FormInputField.getInstance().getTextAreaInputField(200, 150));
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
