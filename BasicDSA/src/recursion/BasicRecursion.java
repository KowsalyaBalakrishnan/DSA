package recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        printNumbers(3);
    }

    static void printNumbers(int n) {
        if (n > 0) {
            System.out.println(n);
            printNumbers(n - 1);
        }
    }
}
