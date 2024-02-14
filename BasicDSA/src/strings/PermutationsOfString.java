package strings;

public class PermutationsOfString {

    public static void main(String[] args) {

        String str = "ABC";
        char[] input = str.toCharArray();
        System.out.println("All the permutations of the string are: ");
        int startIndex = 0;
        generatePermutation(input, startIndex);
    }

    private static void generatePermutation(char[] arr, int startIndex) {
        if (startIndex == arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = startIndex; i < arr.length; i++) {
                swapCharacter(arr, i, startIndex);
                generatePermutation(arr, startIndex + 1);   // second level in tree
                swapCharacter(arr, i, startIndex); // Revert the array when returned because arrays are pass by reference
            }
        }
    }

    static void swapCharacter(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
