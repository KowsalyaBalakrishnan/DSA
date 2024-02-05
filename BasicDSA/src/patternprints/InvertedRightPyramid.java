package patternprints;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        seeding(5);
    }

    public static void seeding(int n) {
        // Write your code here

        for (int i = n; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
