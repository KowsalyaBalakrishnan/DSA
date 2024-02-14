package strings;

public class ValidateString {

    public static void main(String[] args) {

        String name = "Ani123 ";
        boolean isValidName = true;

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (!((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122) || (letter >= 48 && letter <= 57))) {
                isValidName = false;
                break;
            }
        }

        if (isValidName) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
