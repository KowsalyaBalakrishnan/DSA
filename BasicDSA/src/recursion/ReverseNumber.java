package recursion;

import java.util.Scanner;

public class ReverseNumber {

    static int recursionRev = 0;

    public static void main(String[] args) {

        System.out.println("Enter a number :: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int loopReversed = reverseNumberUsingLoop(input);
        System.out.println(loopReversed);

        reverseNumberUsingRecursion(input);
        System.out.println(recursionRev);
    }

    private static void reverseNumberUsingRecursion(int n) {
        if (n != 0) {
            int rem = n % 10;
            n /= 10;
            recursionRev = recursionRev * 10 + rem;
            reverseNumberUsingRecursion(n);
        }
    }

    private static int reverseNumberUsingLoop(int n) {
        int result = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            result = result * 10 + rem;
        }
        return result;
    }
}
