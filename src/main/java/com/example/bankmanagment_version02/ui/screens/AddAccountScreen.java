package com.example.bankmanagment_version02.ui.screens;

import library.CommonFormLayout;
import library.CustomAction;
import library.DynamicSizeFromLayout;
import com.example.bankmanagment_version02.ui.viewmodel.AddAccountFormViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddAccountScreen {
    private final Stage window;
    private final AddAccountFormViewModel viewModel;
    private final Button submitButton;


    public AddAccountScreen() {
        submitButton = new Button("Submit");
        viewModel = new AddAccountFormViewModel();
        CommonFormLayout leaseForm = new CommonFormLayout(
                viewModel.getLabelList(),
                submitAction
        );
        window = new Window(leaseForm, "New Account Screen", 500, 700).getWindow();
    }

    public Stage getWindow() {
        return window;
    }

    private void getFormData(DynamicSizeFromLayout form) {
        for (int i = 1; i < form.getChildren().size(); i = i + 2) {
            String label = ((Label) form.getChildren().get(i - 1)).getText();
                String input = ((TextField) form.getChildren().get(i)).getText();
                viewModel.saveFormData().put(label, input);
            }
    }

    private final CustomAction submitAction = new CustomAction() {
        @Override
        public Node getButton() {
            return submitButton;
        }

        @Override
        public void setListener(DynamicSizeFromLayout form) {
            submitButton.setOnAction(event -> {
                getFormData(form);
                //after getting the data,pass the data to the viewModel
                viewModel.onDone();
            });

        }
    };
}
