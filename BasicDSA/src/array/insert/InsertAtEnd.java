package array.insert;

import java.util.Scanner;

public class InsertAtEnd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array => ");
        int arrSize = scanner.nextInt();

        System.out.println("Enter the number of elements to be inserted => ");
        int numberOfElements = scanner.nextInt();

        if (numberOfElements <= arrSize) {

            System.out.println("Enter the elements of an array => ");
            int[] array = new int[arrSize];
            for (int i = 0; i < numberOfElements; i++) {
                int element = scanner.nextInt();
                array[i] = element;
            }

            System.out.println("Printing Elements...");
            displayArrayElements(array);

            System.out.println("\nDo you want to append any elements at the end? Y or N?");
            String append = scanner.next();
            if (append.equals("Y")) {
                System.out.println("Enter the element to Insert");
                int element = scanner.nextInt();
                insertElementsAtTheEnd(array, element);
            }

        } else {
            System.out.println("Number of Elements are more than the array size");
        }
    }

    private static void insertElementsAtTheEnd(int[] array, int element) {
        boolean isVacancyAvailable = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                isVacancyAvailable = true;
                array[i] = element;
                break;
            }
        }

        if (isVacancyAvailable) {
            System.out.println("Printing Elements...");
            displayArrayElements(array);
        } else {
            System.out.println("Array is Full...");
        }
    }

    private static void displayArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
