package array.reverse;

public class TwoPointersSwap {

    public static void main(String[] args) {

        int[] a = {8, 7};

        int i = 0;
        int j = a.length - 1;

        while (i != j && i < a.length && j >= i) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

    }
}
