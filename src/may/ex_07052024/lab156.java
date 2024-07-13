package may.ex_07052024;

public class lab156 {
    public static void main(String[] args) {
        System.out.println("start of the Program");
        System.out.println("End of the Program");
// NO CALL HERE//
        //HENCE ANS IS SAME
        main(10);
        main("Amol");
       //method overloading function
    }
    static void main(int a) {
        System.out.println(a);
    }

    static void main(String a) {
        System.out.println(a);
    }
    static String main(String[] a,String b) {
        System.out.println(a);
        return "Hello";
    }
    static void god(){
        main(new String[]{"12"});

    }
}







