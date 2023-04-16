package com.example.bankmanagment_version02.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Windows {
    private static Windows instance = null;
    private static final String VIWES = "/com.example.bankmanagment_version02/layout/views.fxml";
    private static final String LEASE_AGREEMENT = "/com.example.bankmanagment_version02/layout/lease_form.fxml";
    private static final String ADD_ACCOUNT = "/com.example.bankmanagment_version02/layout/add_account_layout.fxml";
    private static final String LOGIN_LAYOUT = "/com.example.bankmanagment_version02/layout/login_layout.fxml";
    private static final String VISITATION = "/com.example.bankmanagment_version02/layout/visitation_card.fxml";
    private static final String CONTACT_TO_CUSTOMER = "/com.example.bankmanagment_version02/layout/contact_to_customer.fxml";
    private static final String DASHBOARD = "/com.example.bankmanagment_version02/layout/dashboard.fxml";
    private Stage leaseAgreementWindow;
    private Stage viewWindow;
    private Stage visitationWindow;
    private Stage customerContactWindow;
    private Stage loginWindow;
    private Stage addAccountWindow;
    private Stage dashboard;

    private Windows() {

        loginWindow = getWindow(LOGIN_LAYOUT, "Login", 700, 300);
    }

    private static Stage getWindow(String layout, String title, Integer minWidth, Integer minHeight) {
        try {
            Parent firstRoot = FXMLLoader.load(Objects.requireNonNull(Windows.class.getResource(layout)));
            Scene scene = new Scene(firstRoot);
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(scene);
            stage.sizeToScene();
            stage.setMinWidth(minWidth);
            stage.setMinHeight(minHeight);
            return stage;
        } catch (IOException e) {
            System.out.println("Can not create Window");
        }
        return new Stage();
    }

    public static Windows getInstance() {
        if (instance == null) {
            instance = new Windows();
        }
        return instance;
    }

    public Stage leaseAgreementWindow() {
        leaseAgreementWindow = getWindow(LEASE_AGREEMENT, "Lease Agreement", 600, 500);
        return leaseAgreementWindow;
    }

    public Stage infoViewWindow() {
        viewWindow = getWindow(VIWES, "View Info", 1100, 300);
        return viewWindow;
    }

    public Stage visitationWindow() {
        visitationWindow = getWindow(VISITATION, "Visitation", 700, 500);
        return visitationWindow;
    }

    public Stage customerContactWindow() {
        customerContactWindow = getWindow(CONTACT_TO_CUSTOMER, "Contact to customer", 700, 500);
        return customerContactWindow;
    }

    public Stage addAccountWindow() {
        return addAccountWindow;
    }

    public Stage loginWindow() {

        return loginWindow;
    }

    public Stage dashboard() {
        return dashboard;
    }

    public void setWindowSize(Stage window, int width, int height) {
        window.setMinWidth(width);
        window.setMinHeight(height);
    }
}
