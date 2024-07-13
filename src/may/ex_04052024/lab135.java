package may.ex_04052024;

public class lab135 {
    public static void main(String[] args) {
   //Array
        //collection of simlar Data type


        // find the maximum  in the arrays
        int[]salaries = {30,50,60,90,10,100,999};
        //HOw do we find the max sal in hte array

       // Math.max(); ya madhe fakt 2 ch logic ghe shakto mhanun dusr use karu

        //++ loop -> logic -> max = 0 for i - 0 to length
        //salararies [i]>  max -> max ... 0 to l  - max

        int max_salary = Integer.MIN_VALUE; //-2147483648 to 2147483648
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i]> max_salary) {
                max_salary = salaries[i];
            }
            }
        //by while loop  mehtod //
//        int j =0 ;
//        while (j< salaries.length){
//            if (salaries[j]> max_salary){
//                max_salary= salaries[j];
//
//            }
//            j++;  //when we are coming out //when condition fail ?
        //ans is your J becomes =9 it will fail/or we out

//        }

        System.out.println("Max Sal  ->" + max_salary );
        }

    }

