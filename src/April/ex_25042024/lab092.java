package April.ex_25042024;

import java.util.Scanner;

public class lab092 {
    public static void main(String[] args) {
        // program to check Grade based on Marks

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        //90 -> 90/10 -> 9-> A
        //87 -> 87/10 -> 8-> B
        //77 -> 77/10 -> 7-> C
        //67 -> 67/10 -> 6-> D
 marks = marks/10;
        System.out.println(marks);



        switch (marks){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("none");
        }


    }
}
