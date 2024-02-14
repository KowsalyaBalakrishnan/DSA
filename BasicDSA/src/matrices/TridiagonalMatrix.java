package matrices;

public class TridiagonalMatrix {

    public static void main(String[] args) {

        int[][] triDiagonalMatrix = new int[5][5];

        for (int i = 0; i < triDiagonalMatrix.length; i++) {
            for (int j = 0; j < triDiagonalMatrix[i].length; j++) {
                if (i == j || (i - j == 1) || (i - j == -1)) {
                    triDiagonalMatrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < triDiagonalMatrix.length; i++) {
            for (int j = 0; j < triDiagonalMatrix[i].length; j++) {
                System.out.print(triDiagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
