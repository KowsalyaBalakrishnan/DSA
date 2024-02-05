package org.dsa.practice;

public class Main {
    public static void main(String[] args) {
        int output = evenlyDivides(12);
        System.out.println("Output => " + output);
    }

    static int evenlyDivides(int N) {
        // code here
        int length = String.valueOf(N).length();
        int tempInput = N;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int quo =  tempInput / 10;
            int rem = tempInput % 10;

            if (rem == 0) {
                tempInput = quo;
                continue;
            }

            int res = N % rem;
            if (res == 0) {
                count++;
            }
            tempInput = quo;
        }
        return count;
    }
}