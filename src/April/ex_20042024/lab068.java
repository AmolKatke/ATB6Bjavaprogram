package April.ex_20042024;

import java.util.Scanner;

public class lab068 {
    public static void main(String[] args) {
        //question  3/ (x2 + y2 - |z| )
        //x=10 ,y=12.4 , z = 56.78
//
//        double x= 10;
//        double y = 12.4;
////        double z = 56.78;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for X");
        double x =sc.nextDouble();
        System.out.println("enter the value for the y");
        double y = sc.nextDouble();
        System.out.println("enter the value for the z");
         double z = sc.nextDouble();

         double result;

     // 3/ x2+y2 - |z|
        // A + B - C, A--> X2 ,B --> Y2 , C--> |Z| --> Z value if in  (negative) --> -1= 1, -2= 2

        result =Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);

sc.close();

//always at the end of scanner sc.close should be write


    }
}
