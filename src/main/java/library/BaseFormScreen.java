package library;

import library.AbstractFormViewModel;
import com.example.bankmanagment_version02.utils.Window;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import library.LabelToFormLayout;
import library.layouts.BaseFromLayout;
import library.layouts.CustomAction;

public abstract class BaseFormScreen {
    protected Stage window;
    protected AbstractFormViewModel viewModel;
    protected Button submitButton;

    public BaseFormScreen(String windowTitle, AbstractFormViewModel viewModel) {
        submitButton = new Button("Submit");
        this.viewModel = viewModel;
        LabelToFormLayout layout = new LabelToFormLayout(viewModel.getLabelList(), createSubmitAction());
        window = new Window(layout, windowTitle, 500, 700).getWindow();
    }

    public Stage getWindow() {
        return window;
    }

    private void getFormData(BaseFromLayout form) {
        for (int i = 2; i < form.getChildren().size(); i = i + 3) {
            String label = ((Label) form.getChildren().get(i - 2)).getText();
            if (form.getChildren().get(i) instanceof TextArea) {
                String input = ((TextArea) form.getChildren().get(i)).getText();
                viewModel.saveFormData().put(label, input);
            } else if (form.getChildren().get(i) instanceof TextField) {
                String input = ((TextField) form.getChildren().get(i)).getText();
                viewModel.saveFormData().put(label, input);
            } else if (form.getChildren().get(i) instanceof ImageView) {
                Image input = ((ImageView) form.getChildren().get(i)).getImage();
                viewModel.saveFormData().put(label, input);
            } else if (form.getChildren().get(i) instanceof CheckBox) {
                Boolean input = ((CheckBox) form.getChildren().get(i)).isSelected();
                viewModel.saveFormData().put(label, input);
            }
        }
    }

    private CustomAction createSubmitAction() {
        return new CustomAction() {
            @Override
            public Node getButton() {
                return submitButton;
            }



            @Override
            public void setListener(BaseFromLayout form) {
                submitButton.setOnAction(event -> {
                    getFormData(form);
                    viewModel.onDone();
                });
            }
        };
    }
}
