package April.ex_23042024;

import java.util.Scanner;

public class lab079 {
    public static void main(String[] args) {
        //Tringle classifer :
        //
        //write a program that  classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of sides , determine

        //if the triangle is equilateral (all sides are equal),
        //isosceles (exactly two side are equal),or
        //scalene (no side are equal ), or
        //use an if -else statment to classify the triangle.

        //side 1,side 2, side 3 -->

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side1,side2,side3, i will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
//conditions
        // = is for assign for the value
        // == is for compare

        if ((side1 == side2) && (side1 == side3) && (side2 == side3)) {
            System.out.println("EQ");
        }else if ((side1 == side2 )  || (side1 == side3) || (side2 == side3)) {
            System.out.println("ISO");
        }else {
            System.out.println("Scalene");

        }
        }





    }

