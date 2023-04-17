package com.example.bankmanagment_version02.data.model;

import java.util.HashMap;

public class LoginFormModel {
    private String userName;
    private String passWord;

    public LoginFormModel(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "LoginFormModel{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
