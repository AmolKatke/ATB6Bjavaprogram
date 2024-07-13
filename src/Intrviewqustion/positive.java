package Intrviewqustion;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
       //program to check if number is positive/ negative oe zero


        System.out.println("Enter num ");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();



        if (num > 0) {

            System.out.println("mun is positive  ->" + num);
        }else if (num < 0){
            System.out.println("num is negative  ->"+num);
        }else {
            System.out.println("num is zero -->"+num);
        }

        sc.close();

    }
}
