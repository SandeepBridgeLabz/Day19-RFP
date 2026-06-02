import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);
    }

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();

        System.out.println(user.validateFirstName("Kiran"));
        System.out.println(user.validateFirstName("ki"));
    }
}