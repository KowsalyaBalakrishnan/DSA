package array.insert;

import java.util.Scanner;

public class InsertInSortedArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size => ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements => ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        displayArray(arr);

        if (arr[arr.length - 1] == 0) {
            System.out.println("Enter the element to Insert => ");
            int newElement = scanner.nextInt();
            proceedToInsert(arr, newElement);
            System.out.println("Displaying Updated Array");
            displayArray(arr);

        } else {
            System.out.println("No Space to Insert new element");
        }
    }

    private static void proceedToInsert(int[] arr, int element) {
        int i = arr.length - 1;
        for (; i >= 0; i--) {
            if (arr[i] != 0) {
                if (element < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
        }
        arr[i + 1] = element;
    }

    private static void displayArray(int[] arr) {
        System.out.println("Displaying Array Elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
