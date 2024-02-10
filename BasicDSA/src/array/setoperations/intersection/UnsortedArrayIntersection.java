package array.setoperations.intersection;

public class UnsortedArrayIntersection {

    public static void main(String[] args) {

        int[] a = {9, 17, 3, 2, 6};
        int[] b = {17, 8, 6, 17, 9};

        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    break;
                }
            }
        }


        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }


    }
}
