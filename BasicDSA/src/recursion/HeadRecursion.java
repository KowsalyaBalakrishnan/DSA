package recursion;

public class HeadRecursion {

    public static void main(String[] args) {
        int x = printHead(3);
        System.out.println("Final => " + x);
    }

    static int printHead(int n) {
        if (n > 0) {
            int x = printHead(n - 1) + n;
            System.out.println(x);
            return x;
        }
        return 0;
    }
}
