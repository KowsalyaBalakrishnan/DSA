package strings;

public class PalindromeTwoPointers {

    public static void main(String[] args) {

        String word = "malayalam";
        word = word.toLowerCase();

        int i = 0;
        int j = word.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            char leftCharacter = word.charAt(i);
            char rightCharacter = word.charAt(j);

            if (leftCharacter != rightCharacter) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (!isPalindrome) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
