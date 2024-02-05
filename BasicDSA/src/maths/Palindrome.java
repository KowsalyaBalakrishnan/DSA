package maths;

public class Palindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(-121);
        System.out.println("isPalindrome => " + palindrome);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversedDigits = reverseDigits(x);
        return reversedDigits == x;
    }

    private static int reverseDigits(int x) {
        if (x == 0) return x;

        int reversed = 0;
        while (x != 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x / 10;
        }
        return reversed;
    }
}
