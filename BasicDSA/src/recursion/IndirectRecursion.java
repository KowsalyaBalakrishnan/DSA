package recursion;

public class IndirectRecursion {

    public static void main(String[] args) {

        funA(9);
    }

    static void funA(int n) {
        if (n > 0) {
            System.out.println(n);
            funB(n - 1);
        }
    }

    static void funB(int n) {
        if (n > 1) {
            System.out.println(n);
            funA(n / 2);
        }
    }
}
