package array.duplicates;

public class DuplicateElementsSortedArray {

    public static void main(String[] args) {

        int[] a = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};

        int lastDuplicateElement = -1;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1] && lastDuplicateElement != a[i + 1]) {
                System.out.print(a[i] + " ");
                lastDuplicateElement = a[i];
            }
        }
    }
}
