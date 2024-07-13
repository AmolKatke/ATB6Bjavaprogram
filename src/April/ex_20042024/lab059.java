package April.ex_20042024;

public class lab059 {
    public static void main(String[] args) {
       String name = "The Testing Academy";  //SCP
        String name1 = "The Testing Academy";  //SCP
        String name2 =new String("The Testing Academy"); //object OA

        System.out.println(name == name);//== it's for compare not equal
// check for reference
         //then ans will be in  boolean
// have to check content ,why checking ref?

        // # I N T E R V I E W    Q U E ST I O N   # //

        System.out.println(name == name1); //check ref
        System.out.println(name.equals(name1));  //chck the faltue

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
       // contat will be tha same



    }
}
