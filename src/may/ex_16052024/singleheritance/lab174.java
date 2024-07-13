package may.ex_16052024.singleheritance;

public class lab174 {
    public static void main(String[] args) {
//        what is Inheritance?
        //Inherit Attributes and behaviour from the parent ,Grant parent.

        //Superclass / parent class / base class
        //subclass child class Derived class

        //parent -> child
        //child extends parent
        //extend keyword -> parents ATTributes are available to the child{class)
        programming p = new programming(12,"KO posan");
        Java j =new Java("lambda exp");

        p.printInfo();
        j.printInfo();


        programming p1 =new programming(12,"van Russom");

         p1.printInfo();

         python python = new python();
         python.printInfo();

    }
}
