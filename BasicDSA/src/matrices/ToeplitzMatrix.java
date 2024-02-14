package matrices;

public class ToeplitzMatrix {

    public static void main(String[] args) {

        int[][] toeplitz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int diff = i - j;
                toeplitz[i][j] = diff;
            }
        }

        for (int i = 0; i < toeplitz.length; i++) {
            for (int j = 0; j < toeplitz[i].length; j++) {
                System.out.print(toeplitz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
