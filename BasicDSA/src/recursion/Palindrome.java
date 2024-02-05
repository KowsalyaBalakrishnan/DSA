package recursion;

import java.util.Arrays;

public class Palindrome {

    static char[] reversed;
    static int i = 0;
    public static void main(String[] args) {

        String input = "ABAD";
        char[] chars = input.toCharArray();
        int n = 0;
        reversed = new char[chars.length];

        returnCharArrayInReverse(chars, chars.length, n);

        StringBuilder reversedStr = new StringBuilder();
        for (int j = 0; j < reversed.length; j++) {
            reversedStr.append(reversed[j]);
        }

        if (reversedStr.toString().equals(input)) {
            System.out.println("maths.Palindrome");
        } else {
            System.out.println("Not a maths.Palindrome");
        }
    }

    private static void returnCharArrayInReverse(char[] arr, int length, int n) {
        if (n < length) {
            char data = arr[n];
            n++;
            returnCharArrayInReverse(arr, length, n);
            reversed[i] = data;
            i++;
        }
    }
}
