package strings;

public class DuplicatesWithHashTable {

    public static void main(String[] args) {

        String word = "findFing";
        word = word.toLowerCase();
        char[] chars = word.toCharArray();

        int max = 25;
        int[] hashArray = new int[max + 1];

        for (int i = 0; i < chars.length; i++) {
            int ascii = chars[i];
            int hashIndex = 0;

            if (ascii >= 65 && ascii <= 90) {
                hashIndex = ascii - 65; // Upper case
            } else if (ascii >= 97 && ascii <= 122) {
                hashIndex = ascii - 97; //Lower case
            }

            if (hashArray[hashIndex] == 0) {
                hashArray[hashIndex] = 1;
            } else {
                hashArray[hashIndex]++;
            }
        }

        // Print any one case letter
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] > 1) {
                int ascii1 = i + 97;
                char lowerCase = (char) ascii1;
                System.out.println(lowerCase);
            }
        }

    }
}
