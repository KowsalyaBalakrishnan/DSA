package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] a = {3, -2};
        int targetSum = -1;
        int[] result = twoSum(a, targetSum);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> numberIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numberIndex.get(difference) == null) {
                numberIndex.put(nums[i], i);
            } else if (numberIndex.get(difference) != null &&
                    (numberIndex.get(difference) >= 0 && numberIndex.get(difference) < nums.length)){
                result[0] = numberIndex.get(difference);
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
