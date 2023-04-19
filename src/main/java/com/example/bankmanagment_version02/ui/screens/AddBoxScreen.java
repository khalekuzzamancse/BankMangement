package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.viewmodel.AddBoxViewModel;
import com.example.bankmanagment_version02.ui.viewmodel.AddLeaseFormViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import library.CommonFormLayout;
import library.CommonFormViewModel;
import library.CustomAction;
import library.DynamicSizeFromLayout;

public class AddBoxScreen {
    private final Stage window;
    private final CommonFormViewModel viewModel;
    private final Button submitButton;


    public AddBoxScreen() {
        submitButton = new Button("Submit");
        viewModel = new AddBoxViewModel();
        CommonFormLayout leaseForm = new CommonFormLayout(
                viewModel.getLabelList(),
                submitAction,
                viewModel.getInputFieldWidths(),
                viewModel.getInputFieldHeights()
        );
        window = new Window(leaseForm, "Add Box Screen", 500, 600).getWindow();
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
