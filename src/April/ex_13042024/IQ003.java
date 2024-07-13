package April.ex_13042024;

public class IQ003 {
    public static void main(String[] args) {
        byte a= 10;
        byte b= 45;
        System.out.println(a+b);
        //interview - is always left  ---> right concatination
//concatination
        String name = "amol";
        System.out.println(a+name);
        System.out.println(name+a);

        System.out.println(a+b+name); //here integer will happen then concatination happen


        //all the + below are concatination
        System.out.println(name+a+b); //here concatination will happen then integer happen



    }
}
