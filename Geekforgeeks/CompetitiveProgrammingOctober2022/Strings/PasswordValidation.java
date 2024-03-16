package Strings;

/**
 * Task for the day

Password validator

A password most have 

1. Capital letter
2. Special character
3. Greater than 8 characters
4. At least one number 
 */
public class PasswordValidation {

    static boolean validatePass(String password) {
        String specialCharacters = "!@#$%^&*()-+";
    
        if (password.length() < 8) {
            return false;
        }
    
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
    
        boolean hasSpecialCharacter = false;
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialCharacter = true;
                break;
            }
        }
    
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
    
        return hasUpperCase && hasSpecialCharacter && hasDigit;
    }

    public static void main(String [] args){
        String password = "Jane26!tryuu";
        int n = password.length();

        System.out.println(validatePass(password));
    }
}
