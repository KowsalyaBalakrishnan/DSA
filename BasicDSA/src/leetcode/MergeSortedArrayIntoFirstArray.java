package leetcode;

public class MergeSortedArrayIntoFirstArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        int m = 3;
        int n = 3;

        /*int[] a = new int[1];
        int[] b = {3};
        int m = 0;
        int n = 1;*/

       /* System.out.println("BEFORE => Printing nums1[]");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }*/

        merge(a, m, b, n);
        //System.out.println();

        System.out.println("AFTER => Printing nums1[]");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
