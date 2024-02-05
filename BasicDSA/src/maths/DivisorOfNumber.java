package maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorOfNumber {
    public static void main(String[] args) {
        List<Integer> divisors = printDivisors(36);
        for (Integer divisor : divisors) {
            System.out.println(divisor);
        }
    }

    public static List<Integer> printDivisors(int n) {
        // Write your code here
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            int rem = n % i;
            if (rem == 0) {
                if (!divisors.contains(rem)) {
                    divisors.add(i);
                }

                int anotherDivisor = n / i;
                if (!divisors.contains(anotherDivisor) && anotherDivisor != i) {
                    divisors.add(anotherDivisor);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
