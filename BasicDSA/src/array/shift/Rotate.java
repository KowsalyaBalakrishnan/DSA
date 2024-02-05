package array.shift;

public class Rotate {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        leftRotate(a);
        rightRotate(a);

    }

    private static void rightRotate(int[] a) {

        int i = a.length - 1;
        int temp = a[a.length - 1];

        for (; i >= 1; i --) {
            a[i] = a[i-1];
        }

        a[i] = temp;

        System.out.println("Right Rotate");
        displayArr(a);
    }

    private static void leftRotate(int[] a) {

        int i = 0;
        int temp = a[0];
        for (; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[i] = temp;

        System.out.println("Left Rotate");
        displayArr(a);

    }

    private static void displayArr(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
