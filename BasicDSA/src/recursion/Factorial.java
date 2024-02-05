package recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        else return factorial(n - 1) * n;
    }
}
