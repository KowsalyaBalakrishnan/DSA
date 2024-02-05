package recursion;

public class Power {

    static int count = 1;

    public static void main(String[] args) {
        int result = computePower(4, 3);
        System.out.println(result);

        int res = alternateWay(4, 3);
        System.out.println(res);
    }

    private static int alternateWay(int m, int n) {
        if (n == 0) return 1;
        else {
            return alternateWay(m, n - 1) * m;
        }

    }

    private static int computePower(int base, int exponent) {
        if (count == exponent) {
            return base;
        } else {
            count++;
            return computePower(base, exponent) * base;
        }
    }
}
