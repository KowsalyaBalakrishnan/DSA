package array.sumpair;

public class GenericWaySumPairUnsortedArray {

    public static void main(String[] args) {

        int[] a = {6, 3, 8, 10, 16, 7, 5, 2, 9, 14, -4};
        int k = 10;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println(a[i] + "," + a[j]);
                }
            }
        }
    }
}
