package recursion;

public class CombinationSeries {
    public static void main(String[] args) {
        int res = combination(4, 3);
        System.out.println(res);
    }

    private static int combination(int n, int r) {
        if (r == 0 || n == r) return 1;
        else {
            return combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }
}
