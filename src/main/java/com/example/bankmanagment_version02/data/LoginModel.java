package com.example.bankmanagment_version02.data;


public class LoginModel {
    private String userName;
    private String password;

    public LoginModel() {
        this.userName = "";
        this.password = "";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isValidUser() {
        System.out.println(userName+","+password);
        // Implement the logic to validate the user credentials
        return userName.equals("admin") && password.equals("admin");
    }
}

