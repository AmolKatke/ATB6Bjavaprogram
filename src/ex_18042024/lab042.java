package ex_18042024;

public class lab042 {
    public static void main(String[] args) {

        int a1= 300;
      //  byte b1 = a1   == its not possible use (byte)
        byte b1= (byte)a1; //explicit casting
        System.out.println(b1);   //44




        //300 -->CONVERTS IN 32 bits     000000000000000000000100101100  ==THIS IN STORE INTEGER
       // byte store only - 8 bites fakt last che 8 digits ghetle jatat
        //// 0 0 1 0 1 1 0 0  == VALUE OF THIS PART IS 44 -- THIS IN BYTE CAN STORE
        //THATS WHY ANS IS 44

    }
}
