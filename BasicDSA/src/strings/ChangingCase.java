package strings;

public class ChangingCase {

    public static void main(String[] args) {

        char[] greet = {'W', 'e', 'L', 'C', 'O', 'M', 'E'};
        char[] convertedString = new char[greet.length];
        int k = 0;

        for (int i = 0; i < greet.length; i++) {
            if (greet[i] >= 65 && greet[i] <= 90) {
                int numericConvert = greet[i] + 32;
                char convertedCaseLetter = (char) numericConvert;
                convertedString[k] = convertedCaseLetter;
                k++;
            } else if (greet[i] >= 97 && greet[i] <= 122) {
                int numericConvert = greet[i] - 32;
                char convertedCaseLetter = (char) numericConvert;
                convertedString[k] = convertedCaseLetter;
                k++;
            }
        }

        for (int i = 0; i < convertedString.length; i++) {
            System.out.println(convertedString[i]);
        }
    }
}
