package array.reverse;

public class GenericMethod {
    public static void main(String[] args) {

        // Create a new array -> traverse 'a' from reverse and add to 'b' from 0th index -> copy it back to 'a'

        int[] a = {8, 3, 9, 4, 5, 7, 4, 2};

        int[] b = new int[a.length];
        int j = 0;

        for (int i = a.length; i > 0; i--) {
            int data = a[i - 1];
            b[j] = data;
            j++;
        }

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
