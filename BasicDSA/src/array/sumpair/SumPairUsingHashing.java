package array.sumpair;

public class SumPairUsingHashing {
    public static void main(String[] args) {

        int[] a = {6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
        int targetSum = 10;

        int max = findMax(a);
        int[] hash = new int[max + 1];

        for (int i = 0; i < a.length; i++) {

            int b = targetSum - a[i];
            if (b >= 0 && hash[b] != 0) {
                System.out.println(a[i] + "," + b);
            }

            int currentElement = a[i];
            hash[currentElement]++;
        }
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
