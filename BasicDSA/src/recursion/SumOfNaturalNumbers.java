package recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int x = computeSum(7);
        System.out.println(x);
    }

    private static int computeSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return computeSum(n - 1) + n;
        }
    }
}
