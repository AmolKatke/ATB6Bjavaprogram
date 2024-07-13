package April.ex_25042024;

import java.util.Scanner;

public class lab090 {
    public static void main(String[] args) {
      //Question  // 3/x_2 + y_2 -|z|
       // solution

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value for the x");
        double x =sc.nextDouble();
        System.out.println("Enter the value for the y");
        double y =sc.nextDouble();
        System.out.println("Enter the vlaue for the z");
        double z = sc.nextDouble();

        double result ;
        // 3/x_2 + y_2 -|z|
        //A + B - C,
        result= Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);

        sc.close();




    }
}
