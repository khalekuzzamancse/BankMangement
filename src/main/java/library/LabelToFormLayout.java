package library;

import com.example.bankmanagment_version02.utils.LayoutUtil;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import library.inputype.InputField;

import java.util.Map;

public class LabelToFormLayout extends Pane {

    public LabelToFormLayout(
            Map<String, InputField> labelList,
            CustomAction done
    ) {
        createView(labelList, done);
    }

    private void createView(
            Map<String, InputField> labelList,
            CustomAction done
    ){
        //this class is going to follow the open-close principle
        //as a result when new input type is added we don't  need
        //to add  an extra if-else branch ,
        // and also we do not  need to modify this class
        //when a new InputType filed added
        //    private final CommonFormViewModel viewModel;
        BaseFromLayout customLayout = new BaseFromLayout();
        for (Map.Entry<String, InputField> entry : labelList.entrySet()) {
            String labelText = entry.getKey();
            InputField fieldType = entry.getValue();
            Label label = new Label(labelText);
            Label colon = new Label(":");
            Node inputField = fieldType.getInputField();
            customLayout.getChildren().addAll(label,colon, inputField);
        }
        done.setListener(customLayout);
        Node button = done.getButton();
        this.getChildren().addAll(customLayout, button);
    }



    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        BaseFromLayout customLayout = (BaseFromLayout) this.getChildren().get(0);
        double formHeight = customLayout.getHeight();
        double formWidth = customLayout.getWidth();
        positionChildren(customLayout, 0, 0, formWidth, formHeight);
        //

        positionChildren(this.getChildren().get(1), (formWidth - 60), formHeight, 60, 40);
        LayoutUtil.alignCenter(this, getChildren());
    }

    private void positionChildren(Node child, double x, double y, double width, double height) {
        child.setLayoutX(x);
        child.setLayoutY(y);
        child.resize(width, height);
    }

    @Override
    public void resize(double width, double height) {
        double padding = 5;
        double layoutHeight = 0;
        double layoutWidth = 0;
        for (Node child : getChildren()) {
            layoutHeight = layoutHeight + child.getBoundsInParent().getHeight() + padding;
            layoutWidth = Math.max(layoutWidth, child.getBoundsInParent().getWidth()) + padding;
        }

        super.resize(layoutWidth, layoutHeight); // set fixed width and height
        LayoutUtil.alignCenter(this, getChildren());
    }


}
