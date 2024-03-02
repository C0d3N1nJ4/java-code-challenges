public class IsPasswordComplex {

    public static void main(String[] args) {
        String password = "DigWeed@2021";
        System.out.println("Is the password complex? " + isComplex(password));
        password = "Password";
        System.out.println("Is the password complex? " + isComplex(password));
        password = "Password@2021";
        System.out.println("Is the password complex? " + isComplex(password));
    }

    private static boolean isComplex(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
            } else if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                hasSpecialCharacter = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
    }
}
