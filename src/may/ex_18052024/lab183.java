package may.ex_18052024;

public class lab183 {
    public static void main(String[] args) {
     //   Student1 sc1 = new Student1();
        Person1 pc1 = new Person1();
        //If child has DC direct constructor -> PC DC will be called by
        //super () automatically in JAVA
        //PC = Parameterises constructor

        //FOR access use following
        //  super.variable
        //super.method()
        //super() -> DC
        //super("pramod") -> PC  Parameterises constructor

        //constructor are not supported
        //variable supported


    }

}
class Person1 {
    Person1(){
        System.out.println("Person1 - DC");

        //Without default constructor no printing will happen


    }
    Person1(String a){
        System.out.println("Person1 -DC");
    }
    Person1(String a,int a1) {
        System.out.println("Person1 -DC");
    }
}

class Student1 extends Person1{
    Student1(){ //default counstructor
      //  super ("Amol"); //match line no 20nd 21
        // super ("Amol",13);
        System.out.println("Student1 - DC");
    }
}