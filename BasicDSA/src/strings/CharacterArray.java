package strings;

public class CharacterArray {

    public static void main(String[] args) {

        char number = 65;
        System.out.println(number);

        int character = 'B';
        System.out.println(character);

        System.out.println("***************");

        char[] chars = {65, 66};
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        char[] chars1 = new char[5];
        chars1[0] = 'A';
        chars1[1] = 'B';

        for (int i = 0; i < chars1.length; i++) {
            System.out.println("i => " + i + " => " + chars1[i]);
        }


    }
}
