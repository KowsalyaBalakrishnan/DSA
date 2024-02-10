package array.setoperations.difference;

public class SortedArrayDifference {

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 9, 19};
        int[] b = {6, 8, 9, 10, 17, 19};

        int[] c = new int[a.length + b.length];

        int low = 0;
        int high = b.length - 1;
        int k = 0;

        // O(n*log n)
        usingBinarySearchForBTraversal(a, b, low, high, c, k);

        // O(n)
        usingMergeSortLoops(a, b, c, k);
    }

    private static void usingMergeSortLoops(int[] a, int[] b, int[] c, int k) {

        int i = 0;
        int j = 0;

        while (i < a.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else if (a[i] > b[j]) {
                j++;
            } else if (a[i] == b[j]) {
                i++;
                j++;
            }
        }

        System.out.println("Using Merge Sorts => \n");
        for (int data : c) {
            System.out.print(data + " ");
        }
    }

    private static void usingBinarySearchForBTraversal(int[] a, int[] b, int low, int high, int[] c, int k) {
        for (int i = 0; i < a.length; i++) {
            int index = binarySearchInB(b, low, high, a[i]);
            if (index == -1) {
                c[k] = a[i];
                k++;
            }
        }

        System.out.println("Using Binary Search => \n");
        for (int data : c) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    private static int binarySearchInB(int[] arr, int low, int high, int element) {
        int result = -1;

        if (low <= high) {
            int mid = (low + high) / 2;
            if (element == arr[mid]) {
                result = mid;
                return result;
            } else if (element < arr[mid]) {
                high = mid - 1;
                return binarySearchInB(arr, low, high, element);
            } else if (element > arr[mid]) {
                low = mid + 1;
                return binarySearchInB(arr, low, high, element);
            }
        }

        return result;
    }
}
