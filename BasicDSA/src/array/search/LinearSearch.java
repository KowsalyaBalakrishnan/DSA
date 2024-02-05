package array.search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {8, 3, 5, 9, 1, 0};


        //int res = linearSearch(arr, key);
        //System.out.println("Search Result => " + res);

        String input;
        do {
            System.out.println("Enter the Search Element => ");
            int key = scanner.nextInt();
            int improvedRes = improvedLinearSearch(arr, key);
            System.out.println("Improved Search => " + improvedRes);
            System.out.println("Printing Array");
            displayArrayElements(arr);
            System.out.println("Do you want to continue the search? Y or N?");
            input = scanner.next();
        } while (input != null && input.equals("Y"));
    }

    private static int improvedLinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                if (i != 0) {
                    swapWithPreviousPosition(arr, i);
                }
                return key;
            }
        }
        return -1;

    }

    private static void swapWithPreviousPosition(int[] arr, int i) {
        int temp = arr[i-1];
        arr[i-1] = arr[i];
        arr[i] = temp;
    }

    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return key;
            }
        }
        return -1;
    }

    private static void displayArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
