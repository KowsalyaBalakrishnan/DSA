package patternprints;

public class InvertedNumberRightPyramid {
    public static void main(String[] args) {
        nNumberTriangle(3);
    }

    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
