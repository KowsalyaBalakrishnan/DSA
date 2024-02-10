package array.setoperations.union;

import java.util.Arrays;

public class UnsortedArray {

    public static void main(String[] args) {

        int[] a = {18, 9, 24, 0, 9};
        int[] b = {4, 15, 7, 21, 7};

        int[] c = new int[a.length + b.length];

        Arrays.fill(c, -1);

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isElementFound = false;
            for (int j = 0; j < c.length; j++) {
                if (a[i] == c[j]) {
                    isElementFound = true;
                    break;
                }
            }

            if (!isElementFound) {
                c[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            boolean isElementFound = false;
            for (int j = 0; j < c.length; j++) {
                if (b[i] == c[j]) {
                    isElementFound = true;
                    break;
                }
            }

            if (!isElementFound) {
                c[k] = b[i];
                k++;
            }
        }

        // Display Elements
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }


    }
}
