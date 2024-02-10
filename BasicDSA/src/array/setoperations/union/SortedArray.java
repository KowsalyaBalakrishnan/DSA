package array.setoperations.union;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedArray {

    public static void main(String[] args) {

        /*int[] a = {0, 9, 9, 24, 27};
        int[] b = {4, 7, 7, 15, 21};*/

        int[] a = {1, 1, 2, 100};
        int[] b = {3, 4};

        int[] c = new int[a.length + b.length];

        Arrays.fill(c, -1);

        int i = 0;
        int j = 0;
        int k = 0;

        List<Integer> elementList = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (elementList.isEmpty()) {
                if (a[i] < b[j]) {
                    elementList.add(a[i]);
                    c[k] = a[i];
                    i++;
                    k++;
                } else if (b[j] < a[i]) {
                    elementList.add(b[j]);
                    c[k] = b[j];
                    j++;
                    k++;
                }
            } else {
                if (a[i] < b[j]) {
                    if (!elementList.contains(a[i])) {
                        elementList.add(a[i]);
                        c[k] = a[i];
                        i++;
                        k++;
                    } else {
                        i++;
                    }
                } else if (b[j] < a[i]) {
                    if (!elementList.contains(b[j])) {
                        elementList.add(b[j]);
                        c[k] = b[j];
                        j++;
                        k++;
                    } else {
                        j++;
                    }
                } else if (a[i] == b[j]) {
                    if (!elementList.contains(b[j])) {
                        elementList.add(b[j]);
                        c[k] = a[i];
                        i++;
                        j++;
                        k++;
                    } else {
                        i++;
                        j++;
                    }
                }
            }
        }

        if (j == b.length) {
            while (i < a.length && !elementList.contains(a[i])) {
                elementList.add(a[i]);
                c[k] = a[i];
                i++;
                k++;
            }
        }

        if (i == a.length) {
            while (j < b.length && !elementList.contains(b[j])) {
                elementList.add(b[j]);
                c[k] = b[j];
                k++;
                j++;
            }
        }

        // Display
        for (int value : c) {
            System.out.print(value + " ");
        }
    }
}
