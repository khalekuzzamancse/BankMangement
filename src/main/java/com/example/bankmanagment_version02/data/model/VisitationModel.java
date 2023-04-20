package com.example.bankmanagment_version02.data.model;

import Utils.DateTimeUtils;
import javafx.scene.image.Image;

public class VisitationModel {
    private String accountNo;
    private String boxKey;
    private Boolean asDeputy;
    private Image signature;
    private Image attendeeSignature;
    private String description;
    private String date;
    private String time;

    public VisitationModel(
            String accountNo, String boxKey, Boolean asDeputy,
            Image signature, Image attendeeSignature,
            String description) {
        this.accountNo = accountNo;
        this.boxKey = boxKey;
        this.asDeputy = asDeputy;
        this.signature = signature;
        this.attendeeSignature = attendeeSignature;
        this.description = description;
        this.date = DateTimeUtils.getCurrentDate();
        this.time = DateTimeUtils.getCurrentTime();
    }

    // getters and setters for all properties

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBoxKey() {
        return boxKey;
    }

    public void setBoxKey(String boxKey) {
        this.boxKey = boxKey;
    }

    public Boolean getAsDeputy() {
        return asDeputy;
    }

    public void setAsDeputy(Boolean asDeputy) {
        this.asDeputy = asDeputy;
    }

    public Image getSignature() {
        return signature;
    }

    public void setSignature(Image signature) {
        this.signature = signature;
    }


    public Image getAttendeeSignature() {
        return attendeeSignature;
    }

    public void setAttendeeSignature(Image attendeeSignature) {
        this.attendeeSignature = attendeeSignature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "VisitationModel{" +
                "accountNo='" + accountNo + '\'' +
                ", boxKey='" + boxKey + '\'' +
                ", asDeputy=" + asDeputy +
                ", signature=" + signature +
                ", attendeeSignature=" + attendeeSignature +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
