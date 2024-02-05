package array.generalops;

public class Sum {

    public static void main(String[] args) {

        int[] arr = {8, 3, 9, 15, 6, 10, 7, 2, 12, 4, 0};

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }

        System.out.println("Sum => " + sum);

        int recursiveSum = sumRecursive(arr, arr.length - 1, 0);
        System.out.println("recursiveSum => " + recursiveSum);
    }

    private static int sumRecursive(int[] arr, int n, int sum) {
        if (n == 0) {
            return arr[n];
        } else {
            sum = arr[n] + sumRecursive(arr, n - 1, sum);
            return sum;
        }
    }
}
