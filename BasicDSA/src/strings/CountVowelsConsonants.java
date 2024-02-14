package strings;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        String sentence = "How are you       ";
        char[] chars = sentence.toCharArray();

        int wordCount = 0;
        int consonantsCount = 0;
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' && chars[i - 1] != ' ') {
                wordCount++;
            } else if (
                    (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') ||
                    (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U')
            ) {
                vowelsCount++;
            } else if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) {
                consonantsCount++;
            }
        }

        System.out.println("Number of Words :: " + (wordCount));
        System.out.println("Number of Consonants :: " + consonantsCount);
        System.out.println("Number of Vowels :: " + vowelsCount);

    }
}
