package recursion;

public class StaticVariableRecursion {
    static int x = 0;
    public static void main(String[] args) {
        int funcResult = func(5);
        System.out.println(funcResult);
    }

    static int func(int n) {
        if (n > 0) {
            x++;
            return func(n - 1) + x;
        }
        return 0;
    }
}
