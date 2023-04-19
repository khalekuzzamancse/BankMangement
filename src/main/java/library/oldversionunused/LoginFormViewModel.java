package library.oldversionunused;

import com.example.bankmanagment_version02.data.model.LoginFormModel;
import com.example.bankmanagment_version02.utils.Snackbar;
import library.oldversionunused.FormViewModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LoginFormViewModel implements FormViewModel {
    private final HashMap<String, String> formData;
    private LoginFormModel model;

    public LoginFormViewModel() {
        formData = new HashMap<>();
    }

    @Override
    public List<String> getLabelList() {
        return Arrays.asList("User Name", "Password");
    }

    @Override
    public String getDoneButtonLabel() {
        return "Login";
    }

    @Override
    public HashMap<String, String> saveFormData() {
        return formData;
    }

    public void onDone() {
        model=new LoginFormModel(formData.get("User Name"), formData.get("Password"));
        Snackbar.show("Sucess");
        System.out.println(model);
    }
}
