package may.ex_11052024;

public class student {
    //Attribution
    String name;
    long phoneNo;
    byte id;
    String Email;
    boolean isMale_Female;
    String[] address;
    String courseName;


    //behave
    void enroll(String course) {
        System.out.println("student enroll in -> " + course);
    }
     void language(String language){
         System.out.println("student language is ->" + language);

     }
     void background( String background){

        System.out.println("student background is -> " + background);
     }



}
