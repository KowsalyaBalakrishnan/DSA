package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public static void main(String[] args) {

        int[] a = {0, 1};
        /*int missingNumber = missingNumber(a);
        System.out.println(missingNumber);*/

        int i = usingNaturalNumbers(a);
        System.out.println(i);

    }

    private static int usingNaturalNumbers(int[] nums) {

        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        max++;
        int sumOfNaturalNumbers = (max * (max + 1)) / 2;

        int sumOfCurrentArray = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfCurrentArray += nums[i];
        }

        return sumOfNaturalNumbers - sumOfCurrentArray;
    }

    public static int missingNumber(int[] nums) {
        int missingNumber = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }

        int length = nums.length;
        for (int i = 0; i <= length; i++) {
            if (map.get(i) == null) {
                missingNumber = i;
                break;
            }
        }

        return missingNumber;
    }
}
