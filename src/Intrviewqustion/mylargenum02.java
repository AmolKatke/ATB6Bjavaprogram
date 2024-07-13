package Intrviewqustion;

import java.util.Scanner;

public class mylargenum02 {
    public static void main(String[] args) {
        //find the largest number
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three number");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();



        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("largest num is -->"+num1);
        }else if ((num2 >= num1) && (num2 >= num3 )) {
            System.out.println("largest num is --> " + num2);
        }else {
            System.out.println("largest num is --> "+ num3);
            }

         sc.close();



        }






    }

