package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1};
        boolean result = containsDuplicate(a);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            if (count.get(num) == null) {
                count.put(num, 1);
            } else {
                isDuplicate = true;
                break;
            }
        }

        return isDuplicate;
    }
}
