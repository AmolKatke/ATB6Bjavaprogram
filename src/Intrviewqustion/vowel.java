package Intrviewqustion;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        //** vowel consonant checker **//




        Scanner sc =new Scanner(System.in);
        //input character from user
        System.out.println("Enter a character");
        char ch =sc.next().charAt(0);

        //chacking if the character is a vowel
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
             System.out.println(ch + "is a vowel");
         }else {
             System.out.println(ch + "is a consonant");
         }
         }
    }


