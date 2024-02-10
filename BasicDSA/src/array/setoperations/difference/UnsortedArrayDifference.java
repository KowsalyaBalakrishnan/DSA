package array.setoperations.difference;

public class UnsortedArrayDifference {

    public static void main(String[] args) {

        int[] a = {9, 17, 3, 2, 6};
        int[] b = {17, 8, 6, 17, 9};

        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDataFound = false;
            for (int j = 0; j < b.length; j++) {
               if (a[i] == b[j]) {
                   isDataFound = true;
               }
            }

            if (!isDataFound) {
                c[k] = a[i];
                k++;
            }
        }


        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
