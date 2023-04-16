module com.example.bankmanagment_version02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankmanagment_version02 to javafx.fxml;
    exports com.example.bankmanagment_version02;
}