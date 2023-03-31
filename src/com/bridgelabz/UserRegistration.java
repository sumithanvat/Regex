package com.bridgelabz;
import java.util.regex.Pattern;
public class UserRegistration {

  public static boolean validateFirstName(String firstName) {
        /**
         * Validates the first name input by the user.
         *
         * @param firstName String, the user's first name input
         * @return boolean, true if the first name is valid, false otherwise
         */
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        return pattern.matcher(firstName).matches();
    }
}
