package may.ex_04052024;

import java.util.Scanner;

public class lab144 {
    public static void main(String[] args) {
        //** INTERVIEW QUESTION **//
        //palindrome - String
        //naman -> revers kel tari nav tech raht= naman
        //1331 -> 1331

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string, I will check if it is Palindrome or not");
        String user_input = sc.next();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if (user_input.equalsIgnoreCase(rev_user_input)) {
            System.out.println("Plindrome -> " + user_input);
        } else {
            System.out.println("Nope !!");


        }
    }
}