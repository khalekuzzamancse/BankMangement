package library.oldversionunused;

import com.example.bankmanagment_version02.utils.StageFactory;
import javafx.stage.Stage;

public class LoginScreen {
    private final Stage window;

    public LoginScreen() {
        HomogenousFormLayout layout = new HomogenousFormLayout(new LoginFormViewModel());
        String title = "Login Screen";
        int width = 500;
        int height = 400;
        window = StageFactory.createStage(layout, title, width, height);
    }

    public Stage getWindow() {
        return window;
    }
}
