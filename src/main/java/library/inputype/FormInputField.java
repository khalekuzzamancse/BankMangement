package library.inputype;

public class FormInputField {

    private static final FormInputField instance = new FormInputField();

    private FormInputField() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static FormInputField getInstance() {
        return instance;
    }

    public InputField getTextInputField() {
        return new TextFieldInputField();
    }

    public InputField getTextAreaInputField() {
        return new TextAreaInputField();
    }

    public InputField getSignatureInputField() {
        return new ImageInputField();
    }

    public InputField getCheckBoxField(String label) {
        return new CheckBoxInputField(label);
    }
}
