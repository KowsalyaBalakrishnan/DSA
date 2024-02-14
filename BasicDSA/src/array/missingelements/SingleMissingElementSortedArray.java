package array.missingelements;

public class SingleMissingElementSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 3};

        int ele1 = usingFormula(arr);
        System.out.println("Missing Element using Formula [Only for Sum of 'N' natural numbers array] => " + ele1);

        int ele2 = usingDifference(arr);
        System.out.println("Missing Element using Difference approach => " + ele2);
    }

    private static int usingDifference(int[] arr) {

        if (arr.length > 2) {
            int firstElement = arr[0];
            int secondElement = arr[1];
            int difference = secondElement - firstElement;

            int i = 0;
            for (; i < arr.length - 1; i++) {
                if (arr[i + 1] - arr[i] != difference) {
                    break;
                }
            }

            return arr[i + 1] - difference;
        } else if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 2) {
            return arr[1] - arr[0];
        } else {
            return -1;
        }
    }

    private static int usingFormula(int[] arr) {
        int lastElement = arr[arr.length - 1];
        int sumOfNaturalNumbers = (lastElement * (lastElement + 1)) / 2;

        int sumOfCurrentArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfCurrentArray += arr[i];
        }

        return sumOfNaturalNumbers - sumOfCurrentArray;
    }
}
