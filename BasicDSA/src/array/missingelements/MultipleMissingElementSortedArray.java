package array.missingelements;

public class MultipleMissingElementSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 15, 17, 21};
        int[] c = new int[arr.length];

        findMultipleMissingElements(arr, c);

        System.out.println("Missing Elements");
        for (int element : c) {
            System.out.print(element + " ");
        }
    }

    private static void findMultipleMissingElements(int[] arr, int[] c) {
        int length = arr.length;
        int k = 0;

        if (length == 1) {
            c[k] = arr[k];
        } else if (length == 2) {
            c[k] = arr[1] - arr[0];
        } else if (length > 2) {
            int difference = arr[1] - arr[0];
            for (int i = 0; i < length - 1; i++) {
                if (arr[i + 1] - arr[i] != difference) {
                    int target = arr[i + 1];
                    int result = arr[i];
                    do {
                        result = result + difference;
                        if (result != target) {
                            c[k] = result;
                            k++;
                        }
                    } while (result != target);
                }
            }
        } else {
            c[k] = -1;
        }
    }
}
