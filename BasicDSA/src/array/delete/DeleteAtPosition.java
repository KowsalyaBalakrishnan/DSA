package array.delete;

import java.util.Scanner;

public class DeleteAtPosition {

    public static void main(String[] args) {

        int[] array = {11, 12, 13, 14, 15};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position => ");
        int pos = scanner.nextInt();

        deleteArrayElementAtPosition(array, pos);

        System.out.println("Printing New Elements...");
        displayArrayElements(array);
    }

    private static void deleteArrayElementAtPosition(int[] array, int pos) {
        int i = pos;
        for (; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = 0;
    }

    private static void displayArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
