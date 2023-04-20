package com.example.bankmanagment_version02.data.model;

import javafx.scene.image.Image;

import java.io.Serializable;
import java.util.UUID;

public class AddLeaseModel  implements Serializable {
    private final String boxKey;
    private Boolean hasDeputy=false;
    private String accountNo;
    private Integer duration;
    private String deputyName;
    private String deputyAddress;
    private String deputyPhoneNo;

    private transient  Image customerSignature;
    private transient  Image deputySignature;
    private transient  Image attendeeSignature;

    public AddLeaseModel(String accountNo, Integer duration, String deputyName, String deputyAddress,
                         String deputyPhoneNo,
                         Image customerSignature, Image deputySignature, Image attendeeSignature,
                         Boolean hasDeputy
    ) {
        this.accountNo = accountNo;
        this.duration = duration;
        this.deputyName = deputyName;
        this.deputyAddress = deputyAddress;
        this.deputyPhoneNo = deputyPhoneNo;
        this.customerSignature = customerSignature;
        this.deputySignature = deputySignature;
        this.attendeeSignature = attendeeSignature;
        this.hasDeputy=hasDeputy;
        boxKey= UUID.randomUUID().toString().substring(0,8);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDeputyName() {
        return deputyName;
    }

    public void setDeputyName(String deputyName) {
        this.deputyName = deputyName;
    }

    public String getDeputyAddress() {
        return deputyAddress;
    }

    public void setDeputyAddress(String deputyAddress) {
        this.deputyAddress = deputyAddress;
    }

    public String getDeputyPhoneNo() {
        return deputyPhoneNo;
    }

    public void setDeputyPhoneNo(String deputyPhoneNo) {
        this.deputyPhoneNo = deputyPhoneNo;
    }

    public Image getCustomerSignature() {
        return customerSignature;
    }

    public void setCustomerSignature(Image customerSignature) {
        this.customerSignature = customerSignature;
    }

    public Image getDeputySignature() {
        return deputySignature;
    }

    public void setDeputySignature(Image deputySignature) {
        this.deputySignature = deputySignature;
    }

    public Image getAttendeeSignature() {
        return attendeeSignature;
    }

    public void setAttendeeSignature(Image attendeeSignature) {
        this.attendeeSignature = attendeeSignature;
    }


    @Override
    public String toString() {
        return "AddLeaseModel{" +
                "boxKey='" + boxKey + '\'' +
                ", hasDeputy=" + hasDeputy +
                ", accountNo='" + accountNo + '\'' +
                ", duration=" + duration +
                ", deputyName='" + deputyName + '\'' +
                ", deputyAddress='" + deputyAddress + '\'' +
                ", deputyPhoneNo='" + deputyPhoneNo + '\'' +
                ", customerSignature=" + customerSignature +
                ", deputySignature=" + deputySignature +
                ", attendeeSignature=" + attendeeSignature +
                '}';
    }
}
