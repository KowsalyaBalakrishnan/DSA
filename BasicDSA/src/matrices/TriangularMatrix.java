package matrices;

public class TriangularMatrix {

    public static void main(String[] args) {
        int[][] lowerTriangular = new int[5][5];
        int[][] upperTriangular = new int[5][5];

        for (int i = 0; i < lowerTriangular.length; i++) {
            for (int j = 0; j < lowerTriangular[i].length; j++) {
                if (i >= j) {
                    lowerTriangular[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < lowerTriangular.length; i++) {
            for (int j = 0; j < lowerTriangular[i].length; j++) {
                System.out.print(lowerTriangular[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int i = 0; i < upperTriangular.length; i++) {
            for (int j = 0; j < upperTriangular[i].length; j++) {
                if (i <= j) {
                    upperTriangular[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < upperTriangular.length; i++) {
            for (int j = 0; j < upperTriangular[i].length; j++) {
                System.out.print(upperTriangular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
