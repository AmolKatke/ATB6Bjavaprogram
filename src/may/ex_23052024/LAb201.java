package may.ex_23052024;

public class LAb201 {
    //Static
    ///Data Member
    //Fuction
    //class
    //Static load when class is loaded -
    public static void main(String[] args) {
        ATB amit = new ATB ("84446365646");
        ATB promod = new ATB ("8378944241");

        amit.printDetails();
        promod.printDetails();
        System.out.println(ATB.courseName);

    }
}
class ATB {
    static String courseName = "ATB";  //static variable
    String phoneNo ;  //Insatnce Variable

    public ATB(String phoneNo) {
       this.phoneNo = phoneNo;
    }
   public void printDetails(){
       System.out.println("your deatail "  +  this.phoneNo);

   }
}

