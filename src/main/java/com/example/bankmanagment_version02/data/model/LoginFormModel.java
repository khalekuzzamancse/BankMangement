package com.example.bankmanagment_version02.data.model;

public class LoginFormModel {
    private String userName;
    private String password;

    public LoginFormModel(String userName, String passWord) {
        this.userName = userName;
        this.password = passWord;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
    public boolean isValidUser() {
        System.out.println(userName+","+ password);
        // Implement the logic to validate the user credentials
        return userName.equals("admin") && password.equals("admin");
    }
    @Override
    public String toString() {
        return "LoginFormModel{" +
                "userName='" + userName + '\'' +
                ", passWord='" + password + '\'' +
                '}';
    }
}
