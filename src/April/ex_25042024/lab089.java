package April.ex_25042024;

public class lab089 {
    public static void main(String[] args) {
      //code matching
        //if code is matching with 66 then whole code will matchin with 66 .
//break is not needed
//yeild is keyword for return to the value  ** rarely use

       char code ='B';
       int val = switch (code){    //int val = 66
           case 'A':
             yield 65;
           case 'B':
               yield 66;
           default:
               System.out.println("not able to find");
             throw new IllegalStateException("Error");
        };


    }
}
