package April.ex_27042024;

import java.util.Scanner;

public class lab097 {
    public static void main(String[] args) {
        //leap year program  -2024
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year = sc.nextInt();

        //check leap year or not 2024,2000,1600

        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 400 == 0)) {
                System.out.println("leap year !");
            } else {
                System.out.println("not a leap year");
            }
        }else {
            System.out.println("not a leap year");
        }
            sc.close();


        }
    }
