package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AddBoxLayoutViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.*;
import library.layouts.BaseFromLayout;
import library.layouts.CustomAction;

public class AddBoxScreen {
    private final Stage window;
    private final CommonFormLayoutViewModel viewModel;
    private final Button submitButton;


    public AddBoxScreen() {
        submitButton = new Button("Submit");
        viewModel = new AddBoxLayoutViewModel();
        LabelToFormLayout leaseForm = new LabelToFormLayout(
                viewModel.getLabelList(),
                submitAction
        );
        window = new Window(leaseForm, "Add Box Screen", 500, 600).getWindow();
    }

    public Stage getWindow() {
        return window;
    }

    private void getFormData(BaseFromLayout form) {
        for (int i = 2; i < form.getChildren().size(); i = i + 3) {
            String label = ((Label) form.getChildren().get(i - 2)).getText();
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
        public void setListener(BaseFromLayout form) {
            submitButton.setOnAction(event -> {
               getFormData(form);
                //after getting the data,pass the data to the viewModel
                viewModel.onDone();
            });

        }
    };
}
