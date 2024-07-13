package may.ex_18052024;

public class lab182 {
    public static void main(String[] args) {
        Student s1 = new Student(); //ncoz student object is created
        s1.display();    // Ans is related to student
    }

}
class Student extends Person{
    //is a relation - inheritance
    void message (){
        System.out.println("I  am Student message");
    }
    void display(){
        //this.message(); // ans is i am student
        // for call ur self use "this" function
        super.message();// ans is i am person message
    } //for call father use "super"
}

class Person {
    void message() {
        System.out.println("I am person message");


    }
}



