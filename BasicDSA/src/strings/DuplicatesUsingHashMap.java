package strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesUsingHashMap {

    public static void main(String[] args) {

        String word = "finding";
        char[] chars = word.toCharArray();

        Map<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (characterCount.isEmpty()) {
                characterCount.put(chars[0], 1);
            } else {
                Integer count = characterCount.get(chars[i]);
                if (count == null) {
                    characterCount.put(chars[i], 1);
                } else {
                    count++;
                    characterCount.put(chars[i], count);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
