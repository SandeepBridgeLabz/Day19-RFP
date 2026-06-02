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

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();

        System.out.println(user.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(user.validateEmail("abc@.com"));
    }
}