package array.sort;

public class CheckArrayIsSorted {

    public static void main(String[] args) {

        int[] arr = {4, 8, 33, 16, 20};

        boolean isSorted = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {  // In case of Desc, arr[i] < arr[i-1]
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }

        if (isSorted) System.out.println("Sorted Array");
        else System.out.println("Unsorted Array");
    }
}
