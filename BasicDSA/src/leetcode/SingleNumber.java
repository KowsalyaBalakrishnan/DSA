package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] a = {1};
        int res = singleNumber(a);
        System.out.println(res);
    }

    public static int singleNumber(int[] nums) {
        int distinct = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]);
                value++;
                map.put(nums[i], value);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                distinct = entry.getKey();
                break;
            }
        }

        return distinct;
    }
}
