package may.ex_11052024;

public class person {
    //Attributes
    String name;
    byte age;
    long phone;
    String[]address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eys_color;

    //Behave / Functionality
    void walk ()
    {
        System.out.println("i can walk");
    }
    void talk (String msg) {
        System.out.println("i will say -> " + msg);

    }
    String sleep (){
        return "sleeping";

    }
    String eat (String itam){
        return itam;
    }
} //cant run this program bcoz no main function
