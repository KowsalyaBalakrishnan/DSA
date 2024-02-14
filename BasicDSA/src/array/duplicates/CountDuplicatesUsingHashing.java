package array.duplicates;

public class CountDuplicatesUsingHashing {      //O(n)

    public static void main(String[] args) {

        int[] a = {3, 8, 8, 22, 12, 15, 15, 15, 15, 29, 22, 24, 24};    // Applicable for sorted and unsorted array

        int max = findMax(a);
        int[] hash = new int[max + 1];

        for (int i = 0; i < a.length; i++) {
            int value = hash[a[i]];
            value++;
            hash[a[i]] = value;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1) {
                System.out.println(i + " -> " + hash[i]);
            }
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
