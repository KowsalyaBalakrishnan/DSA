package strings;

public class AnagramUsingHashTable {

    public static void main(String[] args) {

        String a = "verbose";
        String b = "observe";
        a = a.toLowerCase();
        b = b.toLowerCase();


        if (a.length() != b.length()) {
            System.out.println("Not an Anagram");
        } else {
            int[] hash = new int[26];
            for (int i = 0; i < a.length(); i++) {
                char letterA = a.charAt(i);
                int ascii = letterA - 97;
                hash[ascii] = 1;
            }

            boolean isAnagram = true;
            for (int i = 0; i < b.length(); i++) {
                char letterB = b.charAt(i);
                int ascii = letterB - 97;
                if (hash[ascii] != 1) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
    }
}
