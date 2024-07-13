package may.ex_02052024;

public class lab133 {
    public static void main(String[] args) {
 //fizz buzz  problem   
        //write a program that prints number from 1 to 100 
        //for may.ex_16052024.multiple of 3 , prints "Fizz" insted of the number,
        //and for may.ex_16052024.multiple of 5 , print "BUZZ"
        //for number which are may.ex_16052024.multiple of both 3 and 5,
        // print" FizzBuzz".

        for (int i = 1; i <= 100 ; i++) {
            if (i%3 ==0 && i%5 ==0){
                System.out.println("fizbuzz");

            } else if (i%3 ==0) {
                System.out.println("Fizz");
            } else if (i%5 ==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);

            }

        }



    }
}
