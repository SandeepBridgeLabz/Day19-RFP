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

        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        for (String email : validEmails) {
            System.out.println(email + " : " +
                    user.validateEmail(email));
        }
    }
}