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

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();

        System.out.println(user.validateMobile("91 9919819801"));
        System.out.println(user.validateMobile("919919819801"));
    }
}