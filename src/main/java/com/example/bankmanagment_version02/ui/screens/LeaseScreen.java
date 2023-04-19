package com.example.bankmanagment_version02.ui.screens;

import com.example.bankmanagment_version02.ui.customlayouts.*;
import com.example.bankmanagment_version02.ui.viewmodel.LeaseFormViewModel;
import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Map;

public class LeaseScreen {
    private final Stage window;
    private final CommonFormViewModel viewModel;
    private final Button submitButton;
    private final CustomAction submitAction = new CustomAction() {
        @Override
        public Node getButton() {
            return submitButton;
        }

        @Override
        public void setListener(DynamicSizeFromLayout form) {
            submitButton.setOnAction(event -> {
                for (int i = 1; i < form.getChildren().size(); i = i + 2) {
                    String label = ((Label) form.getChildren().get(i - 1)).getText();
                    if (form.getChildren().get(i) instanceof TextArea) {
                        String input = ((TextArea) form.getChildren().get(i)).getText();
                        System.out.println(input);
                        viewModel.saveFormData().put(label, input);
                    } else if (form.getChildren().get(i) instanceof TextField) {
                        String input = ((TextField) form.getChildren().get(i)).getText();
                        System.out.println(input);
                        viewModel.saveFormData().put(label, input);
                    } else if (form.getChildren().get(i) instanceof ImageView) {
                        Image image = ((ImageView) form.getChildren().get(i)).getImage();
                        System.out.println(image);
                        viewModel.saveFormData().put(label, image);
                    }
                }
            });
            viewModel.onDone();
        }
    };

    public LeaseScreen() {
        submitButton = new Button("Submit");
        viewModel = new LeaseFormViewModel();
        CommonFormLayout layout = new CommonFormLayout(
                viewModel.getLabelList(),
                submitAction,
                viewModel.getInputFieldWidths(),
                viewModel.getInputFieldHeights()
        );
        String title = "Rent Screen";
        int width = 500;
        int height = 600;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
