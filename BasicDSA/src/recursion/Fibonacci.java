package recursion;

import java.util.Arrays;

public class Fibonacci {
    static int[] arr = new int[8];

    public static void main(String[] args) {
        int result = computeFibValue(7);
        System.out.println(result);

        System.out.println("********");

        Arrays.fill(arr, -1);

        int res = withMemoization(7);
        System.out.println(res);


    }


    private static int withMemoization(int n) {
        if (n <= 1) {
            arr[n] = n;
            return n;
        } else {
            if (arr[n - 1] == -1) {
                arr[n - 1] = withMemoization(n - 1);
            }
            if (arr[n - 2] == -1) {
                arr[n - 2] = withMemoization(n - 2);
            }
            arr[n] = arr[n - 1] + arr[n - 2];
            return arr[n - 1] + arr[n - 2];
        }
    }


    static int computeFibValue(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return computeFibValue(n - 1) + computeFibValue(n - 2);
        }
    }
}
