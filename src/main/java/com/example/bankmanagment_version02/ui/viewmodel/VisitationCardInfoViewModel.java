package com.example.bankmanagment_version02.ui.viewmodel;

import com.example.bankmanagment_version02.data.model.VisitationModelWithImage;
import com.example.bankmanagment_version02.repository.Reposititory;
import javafx.scene.image.Image;
import library.layouts.InfoViewFormLayoutViewModel;
import library.outputfield.OutputField;
import library.outputfield.OutputFieldFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class VisitationCardInfoViewModel implements InfoViewFormLayoutViewModel {
    private final HashMap<String, Object> formData;

    private static final Labels labels = new LabelsImpl();

    public VisitationCardInfoViewModel() {
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
        //
        List<VisitationModelWithImage> list= Reposititory.getVisitationsWithImage();
        VisitationModelWithImage data=list.get(0);
        //
        LinkedHashMap<String, OutputField> labelMap = new LinkedHashMap<>();
        labelMap.put(labels.ACCOUNT_NO, OutputFieldFactory.instance().getTextInputField(data.getAccountNo()));
        labelMap.put(labels.BOX_KEY, OutputFieldFactory.instance().getTextInputField(data.getBoxKey()));
        labelMap.put(labels.AS_DEPUTY, OutputFieldFactory.instance().getTextInputField(data.getAsDeputy().toString()));
        labelMap.put(labels.DATE, OutputFieldFactory.instance().getTextInputField(data.getDate()));
        labelMap.put(labels.TIME, OutputFieldFactory.instance().getTextInputField(data.getTime()));
        labelMap.put(labels.ATTENDEE_SIGNATURE, OutputFieldFactory.instance().getImageOutPutField(data.getSingnatureImage()));
        labelMap.put(labels.DESCRIPTION, OutputFieldFactory.instance().getTextInputField(data.getDescription()));
        return labelMap;
    }


    //We want to re-use the label name
    //that is why we declare a  separate inner class

    private interface Labels {
        String ACCOUNT_NO = "Account No";
        String BOX_KEY = "Box Type";
        String AS_DEPUTY = "As Deputy";
        String DATE = "Date";
        String TIME = "Time";
        String ATTENDEE_SIGNATURE = "Attendee Signature";
        String DESCRIPTION = "Description";
    }

    private static class LabelsImpl implements Labels {
    }
}
