package patternprints;

public class RightAngledTrianglePattern {
    public static void main(String[] args) {
        nForest(6);
    }

    public static void nForest(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
