package array.duplicates;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateElementsSortedArray {    // O(n^2)

    public static void main(String[] args) {

        int[] a = {3, 6, 8, 8, 10, 12, 15, 15, 15, 15, 20, 22, 24, 24};
        Map<Integer, Integer> duplicates = new HashMap<>();

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                int duplicate = a[i];
                int j = i;
                int count = 0;
                while (j <= a.length - 1 && a[j] == duplicate) {
                    count++;
                    j++;
                }
                duplicates.put(duplicate, count);
                i = j - 1;
            }
        }

        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
