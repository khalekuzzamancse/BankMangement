package com.example.bankmanagment_version02.data.model;


import Utils.DateTimeUtils;
import javafx.scene.image.Image;
import library.ImageData;

import java.io.Serializable;

public class VisitationModelWithImage implements Serializable {
    private String accountNo;
    private String boxKey;
    private Boolean asDeputy;
    private transient  Image  signature;
    private transient  Image attendeeSignature;
    private String description;
    private String date;
    private String time;

    private ImageData signatureImageData;
    private ImageData attendantSignatureImageData;

    public VisitationModelWithImage(
            String accountNo ,
            String  boxKey,
            Image singnatureImage,
            Image attendantSignature,
            Boolean asDeputy,
            String description)
    {
        this.accountNo = accountNo;
        this.boxKey = boxKey;
        this.date = DateTimeUtils.getCurrentDate();
        this.time = DateTimeUtils.getCurrentTime();
        this.signatureImageData = new ImageData(singnatureImage);
        this.attendantSignatureImageData = new ImageData(attendantSignature);
        this.asDeputy = asDeputy;
        this.description = description;
    }


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ImageData getSignatureImageData() {
        return signatureImageData;
    }

    public void setSignatureImageData(ImageData signatureImageData) {
        this.signatureImageData = signatureImageData;
    }

    public ImageData getAttendantSignatureImageData() {
        return attendantSignatureImageData;
    }

    public void setAttendantSignatureImageData(ImageData attendantSignatureImageData) {
        this.attendantSignatureImageData = attendantSignatureImageData;
    }

    public Image getSingnatureImage() {
        return signatureImageData.getImage();
    }

    public void setSingnatureImageData(ImageData imageData) {
        this.signatureImageData = imageData;
    }

    public Image getAttendantSignature() {
        return attendantSignatureImageData.getImage();
    }

    public void setAttendantSignature(ImageData attendantSignature) {
        this.attendantSignatureImageData = attendantSignature;
    }

    public Boolean getAsDeputy() {
        return asDeputy;
    }

    public void setAsDeputy(Boolean asDeputy) {
        this.asDeputy = asDeputy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VisitationModelWithImage(){

        //this no argument contrcutor will be created empty object
        //when we find a object by it field
    }

    @Override
    public String toString() {
        return "VisitationModelWithImage{" +
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
