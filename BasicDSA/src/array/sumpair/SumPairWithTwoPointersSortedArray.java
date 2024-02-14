package array.sumpair;

public class SumPairWithTwoPointersSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 8, 9, 10, 12, 14};
        int target = 10;

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else if (sum == target) {
                System.out.println(arr[i] + "," + arr[j]);
                i++;
                j--;
            }
        }
    }
}
