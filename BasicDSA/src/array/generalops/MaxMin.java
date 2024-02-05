package array.generalops;

public class MaxMin {

    public static void main(String[] args) {

        int[] arr = {8, 3, 9, 15, 6, 10, 7, 2, 12, 4, 0};

        findMaxMinElement(arr);
    }

    private static void findMaxMinElement(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max Value => " + max);
        System.out.println("Min Value => " + min);
    }
}
