package array.insert;

import java.util.Scanner;

public class InsertElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array => ");
        int arrSize = scanner.nextInt();

        System.out.println("Enter the number of elements to be inserted => ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter the elements of an array => ");
        int[] array = new int[arrSize];
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            array[i] = element;
        }

        System.out.println("Printing Elements...");
        displayArrayElements(array);


    }

    private static void displayArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
