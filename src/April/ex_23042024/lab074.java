package April.ex_23042024;

import java.util.Scanner;

public class lab074 {
    public static void main(String[] args) {
        //taking an input from the user
        //Scanner class
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter your value");
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
        sc.close();
    }
}
