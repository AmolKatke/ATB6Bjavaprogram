package April.ex_25042024;

import java.util.Scanner;

public class lab082 {
    public static void main(String[] args) {
         //take a user input as char and tell the user if it is a vowal
        //a e i o u

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char ,I will tell you if it is a vowel or not!");
        //A -> "A" -> index - A
        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a Vowal ,it is Consonant");


        }
          sc.close();






    }
}
