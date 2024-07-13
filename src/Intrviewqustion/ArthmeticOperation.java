package Intrviewqustion;

import java.util.Scanner;

public class ArthmeticOperation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("which operation do you want to perform");
        char ch  = sc.next().charAt(0);


        int result;
        switch (ch) {
            case '*':
                result=num1*num2;
                System.out.println("the result is" + result );
                break;
            case '-':
                result=num1-num2;
                System.out.println("the result is" + result );
                break;
            case '+':
                result=num1+num2;
                System.out.println("the result is 6" + result );
                break;
            case '/':
                result=num1/num2;
                System.out.println("the result is" + result );
                break;
            case '%':
                result=num1%num2;
                System.out.println("the result is" + result );
                break;
            default:
                System.out.println("invalid input");

                sc.close();
        }

    }
}
