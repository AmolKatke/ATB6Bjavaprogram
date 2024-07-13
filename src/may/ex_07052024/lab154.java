package may.ex_07052024;

import java.util.Scanner;

public class lab154  {
    public static void main(String[] args) {
        //divide the task into the samller chunk
        //calculator
        //sum task -> sum function
        //sub task -> sub function
        //mul task -> mul function



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        //CAlc
        int r_sum = sum(num1,num2);
        int r_sab = sab(num1,num2);
        int r_mul = mul(num1,num2);

        System.out.println("Sum is ->" + r_sum);
        System.out.println("sab is ->" + r_sab);
        System.out.println("mul is ->" + r_mul);

    }

    static int mul(int a, int b) {
        return a*b;
    }

    static int sab(int a, int b) {
        return a-b;
    }

    static int sum(int a, int b) {
        return a+b;

    }

}
