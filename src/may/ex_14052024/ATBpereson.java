package may.ex_14052024;

public class ATBpereson {
    //variable

    String name; //instance Variables
    long  phone ;

    public ATBpereson(String name, long phone, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }
    public ATBpereson(String name){
        this.name=name;

    }
    public ATBpereson(String name,long phone) {
        this.name = name;
        this.phone = phone;
    }



    String email;
    boolean isMarried= true;
    String courseName;

    //Constructor
    //default - Constructor

    ATBpereson(){
        System.out.println("Deafult - constructor");
        //Dc
        //special Method with no return type
        //1caaled ,when you create new Object
        //it has same name as the className
    courseName = "ATB";
    }


    void ATBperson(){
        System.out.println("Default - Constructor");
    }
    void printDetails(){
//        int age = 10;
//        System.out.println(age );
        System.out.println("Printing deatails of the student");


    }

}
