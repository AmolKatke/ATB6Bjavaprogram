package April.ex_27042024;

import java.util.Scanner;

public class lab096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ////input character from user
        char ch = sc.next().charAt(0);

        //chacking if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        }else {
            System.out.println("Consonant");

        }



    }
}
