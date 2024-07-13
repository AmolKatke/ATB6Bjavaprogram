package April.ex_25042024;

import java.util.Scanner;

public class lab080 {
    public static void main(String[] args) {
        //if =conditon  (if,else if ,else) may.ex_16052024.multiple conditon can write
        //if = jar as asel tr //else tas nahi tar as 
        //here we learn SWITCH
        //Switch use for may.ex_16052024.multiple condition
        //for days = S M T W T F SATURDAY


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1-7, Iwill tell you day it is");
        int day =scanner.nextInt();

        switch(day){
            case 1:
                System.out.println("MON !");
                break;
            case 2:
                System.out.println("Tus !");
                break;
            case 3:
                System.out.println("WEN!");
                break;
            case 4:
                System.out.println("THUS !");
                break;
            case 5:
                System.out.println("FRI !");
                break;
            case 6:
                System.out.println("SAT !");
                break;
            case 7:
                System.out.println("SUN !");
                break;
            default:
                System.out.println("only number 1-7 are allowed");
        }
        System.out.println("END of the program ,i will be executed anyhow !!");


        
        
    }
}
