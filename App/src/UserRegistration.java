import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);
    }
    public boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", lastName);
    }
    public boolean validateEmail(String email) {
        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$",
                email);
    }
    public boolean validateMobile(String mobile) {
        return Pattern.matches("^[0-9]{1,3}\\s[0-9]{10}$", mobile);
    }

    public boolean validatePasswordRule1(String password) {
        return Pattern.matches("^.{8,}$", password);
    }
    public boolean validatePasswordRule2(String password) {
        return Pattern.matches("^(?=.*[A-Z]).{8,}$", password);
    }
    public boolean validatePasswordRule3(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$", password);
    }
    public boolean validatePasswordRule4(String password) {
        return Pattern.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1})(?!.*[^a-zA-Z0-9].*[^a-zA-Z0-9]).{8,}$",
                password);
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();

        System.out.println(user.validatePasswordRule4("Password1@"));
        System.out.println(user.validatePasswordRule4("Password1@#"));
    }
}