package array.search;

import java.util.Scanner;

public class BinarySearchDesc {

    public static void main(String[] args) {

        int[] sortedArr = {5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Search Key => ");
        int key = scanner.nextInt();

        int low = 0;
        int high = sortedArr.length - 1;

        int result1 = binarySearchByRecursion(low, high, key, sortedArr);
        if (result1 == -1) {
            System.out.println("Data Not Found");
        } else {
            System.out.println("Data Found at Index => " + result1);
        }
    }

    private static int binarySearchByRecursion(int low, int high, int key, int[] sortedArr) {
        int result = -1;
        if (low <= high) {
            int mid = (low + high) / 2;

            if (key == sortedArr[mid]) {
                result = mid;
                return result;
            } else if (sortedArr[mid] < key) {
                high = mid - 1;
                return binarySearchByRecursion(low, high, key, sortedArr);
            } else if (sortedArr[mid] > key) {
                low = mid + 1;
                return binarySearchByRecursion(low, high, key, sortedArr);
            }
        }
        return result;
    }

}
