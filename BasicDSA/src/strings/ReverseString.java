package strings;

public class ReverseString {

    public static void main(String[] args) {

        char[] name = {'P', 'Y', 'T', 'O', 'N'};

        int i = 0;
        int j = name.length - 1;

        while (i < j) {
            char temp = name[i];
            name[i] = name[j];
            name[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < name.length; k++) {
            System.out.print(name[k] + " ");
        }

    }
}
