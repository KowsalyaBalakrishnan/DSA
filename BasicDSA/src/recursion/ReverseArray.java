package recursion;

public class ReverseArray {

    static int i = 0;

    public static void main(String[] args) {

        int[] arr = {7, 3, 1, 6, 2, 68, 291};
        int n = 0;
        returnArrayInReverseOrder(arr, arr.length, n);

        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    private static void returnArrayInReverseOrder(int[] arr, int length, int n) {
        if (n < length) {
            int data = arr[n];
            n++;
            returnArrayInReverseOrder(arr, length, n);
            arr[i] = data;
            i++;
        }
    }
}
