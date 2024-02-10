package array.merge;

public class MergeArrays {

    public static void main(String[] args) {

        int[] a = {3, 8, 16, 20, 25, 30};
        int[] b = {3, 10, 12, 22, 23, 47};

        int[] c = new int[a.length + b.length];

        mergeTwoArrays(a, b, c);

        System.out.println("Updated Array => ");
        for (int mergedArrayElement : c) {
            System.out.print(mergedArrayElement + " ");
        }

    }

    private static void mergeTwoArrays(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else if (a[i] > b[j]) {
                c[k] = b[j];
                k++;
                j++;
            } else if (a[i] == b[j]) {
                c[k] = a[i];
                k++;
                c[k] = b[j];
                k++;

                i++;
                j++;
            }
        }

        if (j == b.length) {
            while (i < a.length) {
                c[k] = a[i];
                k++;
                i++;
            }
        }

        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
    }
}
