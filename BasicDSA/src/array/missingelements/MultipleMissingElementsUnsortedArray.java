package array.missingelements;

public class MultipleMissingElementsUnsortedArray {

    public static void main(String[] args) {

        int[] arr = {3, 7, 4, 12, 9};

        int maxElement = findMax(arr);

        int[] hashedArray = new int[maxElement + 1];
        int[] c = new int[maxElement + 1];

        findMissingDataByHashTableMimic(arr, hashedArray, c);

        System.out.println("Missing Elements =>");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    private static void findMissingDataByHashTableMimic(int[] arr, int[] hashedArray, int[] c) {
        for (int i = 0; i < arr.length; i++) {
            hashedArray[arr[i]] = 1;
        }

        int k = 0;
        for (int i = 1; i < hashedArray.length; i++) {  //Only natural numbers and so 0 is ignored for i
            if (hashedArray[i] == 0) {
                c[k] = i;
                k++;
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
