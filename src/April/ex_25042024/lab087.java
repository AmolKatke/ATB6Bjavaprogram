package April.ex_25042024;

public class lab087 {
    public static void main(String[] args) {
// in one line we use may.ex_16052024.multiple cases

        int itamcode = 001;
//JDK > 13

        switch (itamcode) {
            case 001 -> System.out.println("its a laptop");
            case 002 -> System.out.println("its a desktop");
            case 003,004 -> System.out.println("its a mobile");

            default -> System.out.println("hello");

        }
        char ch ='z';
        switch (ch) {
            case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
            default -> System.out.println("consonant");

        }

    }
}
