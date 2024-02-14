package matrices;

public class DiagonalMatrix {

    public static void main(String[] args) {

        int[] data = {3, 7, 4, 9, 6};

        System.out.println("2D Array");
        using2DArray(data); // Spaces will be wasted
        System.out.println("**************************");
        System.out.println("1D Array");
        using1DArray(data); //2D Consumes spaces other than diagonal indices, we can use 1D itself
    }

    private static void using1DArray(int[] data) {

        int[] out = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    out[i] = data[i];
                }
            }
        }

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }

    private static void using2DArray(int[] data) {
        int[][] diagonalMatrix = new int[5][5];
        for (int i = 0; i < diagonalMatrix.length; i++) {
            for (int j = 0; j < diagonalMatrix[i].length; j++) {
                if (i == j) {
                    diagonalMatrix[i][j] = data[i];
                } else {
                    diagonalMatrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < diagonalMatrix.length; i++) {
            for (int j = 0; j < diagonalMatrix[i].length; j++) {
                System.out.print(diagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
