package April.ex_23042024;

import java.util.Scanner;

public class lab077 {
    public static void main(String[] args) {
        // interview question
        // Grade calculator
        //write a program that calculates and display the letter grade for a given
// numerical score (e.g. A,B,C,D,OR F) based on the following
        //grading scale :
        //A : 90-100
        //B : 80-89
        //C : 70-79
        //D : 60-69
        //F : 0-59

        //1: FInd the user Inputs
        //2: score - data type? -
        // return -> grade -> data type ->  char
        //DAA - ask for the confirmation of the doubts
        ///interviewer --> int,char


        //2: Basic logic
        //if (score >= 90 && score <= 100) --> return or print grade -A
        //else if (score >= 80 && score <= 89) --> print grade B
        // else --> grade --> F

        //3: Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student Score");

        int  score =sc.nextInt();

        char grade = 'F';
        if (score >=90 && score <=100) {
            grade = 'A';
        }
        else if (score >=80 && score <=89) {
        grade = 'B';

        }else if (score >=70 && score <= 79) {
            grade = 'C';
        } else if (score >=60 && score <=69) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("your Grade id -->"+grade);

      sc.close();

    }


    }

