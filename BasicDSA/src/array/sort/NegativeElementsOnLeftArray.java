package array.sort;

public class NegativeElementsOnLeftArray {

    public static void main(String[] args) {

        int[] arr = {-6, 1, 2, 3, -5, 100, 81, 47, -23, -11, 100, -6};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            } else if (arr[i] < 0 && arr[j] < 0) {
                i++;
            } else if (arr[i] > 0 && arr[j] > 0) {
                j--;
            } else {
                i++;
                j--;
            }
        }

        System.out.println("Updated Array => ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
