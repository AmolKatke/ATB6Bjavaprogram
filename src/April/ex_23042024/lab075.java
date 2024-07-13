package April.ex_23042024;

import java.util.Scanner;

public class lab075 {
    public static void main(String[] args) {
       //max number in two
        System.out.println("Enter num 1");
        Scanner sc =new Scanner(System.in);
        int num1 =sc.nextInt();

        System.out.println("Enter num 2");
 int num2 =sc.nextInt();
//also we can write //
// int max  =Math.max(num1,num2);
 //       System.out.println("MAx by Math.max func()"+max);
//varcha program cancatination chya padhatine lihla ahe
 if (num1> num2) {
     //C1 ->


     System.out.println("Max is ->" + num1);
 }else{
     System.out.println("Max  is ->"+num2);
 }

      sc.close();

    }
}
