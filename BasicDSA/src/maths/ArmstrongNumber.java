package maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean res = checkArmstrong(n);
        System.out.println(res);
    }

    private static boolean checkArmstrong(int number) {

        // Get the number of digits
        int numberOfDigits = 0;
        int tempInput = number;
        while (tempInput != 0) {
            tempInput /= 10;
            numberOfDigits++;
        }

        // Compute Sum
        int temp = number;

        double total = 0;
        while (temp != 0) {
            int rem = temp % 10;
            total = total + Math.pow(rem, numberOfDigits);
            temp /= 10;
        }

        return total == number;
    }
}
