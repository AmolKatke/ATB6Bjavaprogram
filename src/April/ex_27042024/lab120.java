package April.ex_27042024;

import java.util.Scanner;

public class lab120 {
    public static void main(String[] args) {
        //Factorial Program
        //1! -> 1
        //2! -> 2*1 -> 2
        //3! -> 3*2*1 -> 6
        //4! -> 4*3*2*1 -> 24
        //5! -> 5*4*3*2*1 -> 120
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long fact = 1;
        //5 = int i= 1,5< 5 , 1
        //A  int i =1;
        //b = i <= num
        //c i++

        //kahli RUN chya ithe i chi amt takaychi tr Ans yet

        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
        sc.close();
        //kahli RUN chya ithe i chi amt takaychi tr Ans yet


    }
}