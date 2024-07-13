package April.ex_20042024;

public class lab053 {
    public static void main(String[] args) {
        //Two way to  create a string
      //1.
        String name = "amol"; //assignment operator

      //2.
        String name2  = new String("amol");  //New operator

       // both are different,actually save the name ,name2 in different ways in JVM

        //HOW they store the values in the JVM ?

        System.out.println(name);
        System.out.println("your name is -> "+ name); //Assignment operator'
        System.out.printf("your name is -> %s",name); // changes - printf  ,%s -String method

        System.out.println("\n-- All the functions available in String --");
// \n is use for get ans in new line
        System.out.println(name.length());
           //how many characters we have in name = amol - 4
        System.out.println(name.toLowerCase());
        // it make u r ans in lower case
        System.out.println(name.toUpperCase());

        int age = 65 ;
        char c = 'a';
        boolean b = true;

          // concept//

        //it's a primitive data type -- byte, int long , short ,double ,float
        //all of them don't have extra functionality
        //JAVA is not pure OBJECT ORIENTED .
        // OOPs -object-oriented - primitive
        // in OOPs -everything is class.
        //OOPs - fully - don't have anything which is not in class format / primitive
        //JAVA is not pure OBJECT ORIENTED .



        //Non-Primitive Data Type
        //string -  Extra functionalities .













    }
}
