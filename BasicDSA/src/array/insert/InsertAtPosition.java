package array.insert;

import java.util.Scanner;

public class InsertAtPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {11, 12, 13, 50, 0};

        System.out.println("Printing Elements...");
        displayArrayElements(array);

        System.out.println("Do you want to insert element at any position? Y or N?");
        String status = scanner.next();

        if (status.equals("Y")) {

            System.out.println("Do you wish to enter Index Position? Y or N?");
            String index = scanner.next();

            int pos;
            if (index.equals("Y")) {
                System.out.println("Enter the Index Position [Begins with 0 for 1st] => ");
                pos = scanner.nextInt();
            } else {
                System.out.println("Enter the Place => ");
                pos = scanner.nextInt();
                pos -= 1;
            }

            System.out.println("Enter the new element => ");
            int newElement = scanner.nextInt();

            insertElementAtPosition(pos, newElement, array);
        }


    }

    private static void insertElementAtPosition(int pos, int newElement, int[] array) {
        boolean isVacantPosExist = false;

        int i = array.length - 1;
        for (; i >= pos; i--) {

            if (array[i] == 0) {
                isVacantPosExist = true;
            }
            if (array[i] != 0 && isVacantPosExist) {
                array[i + 1] = array[i];
            }
        }

        if (isVacantPosExist) {
            array[i+1] = newElement;
            System.out.println("Printing New Elements...");
            displayArrayElements(array);
        } else {
            System.out.println("No vacancy to insert");
        }
    }

    private static void displayArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
