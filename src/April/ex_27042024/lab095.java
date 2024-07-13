package April.ex_27042024;

import java.util.Scanner;

public class lab095 {
    public static void main(String[] args) {
        // find the large number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2");
        int num2 = sc.nextInt();
        System.out.println("enter the number 3");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
        System.out.println(num1);
    }  else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);

        }
      sc.close();
    }



}
