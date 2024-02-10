package array.setoperations.intersection;

public class SortedArrayIntersection {

    public static void main(String[] args) {

        int[] a = {2, 3, 6, 8, 9, 17, 19};
        int[] b = {6, 8, 9, 17, 19};

        int[] c = new int[a.length + b.length];

        int low = 0;
        int high = b.length - 1;
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            int index = binarySearchInB(b, low, high, a[i]);
            if (index != -1) {
                c[k] = b[index];
                k++;
            }
        }

        for (int data : c) {
            System.out.print(data + " ");
        }
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
