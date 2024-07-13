package may.ex_02052024;

public class lab127 {
    public static void main(String[] args) {
        // Interview  question //
        //line no 20 and 24
        // == -  check for
        //.equal() -> values /content

        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = {1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int [] arr3 = arr1;
        System.out.println(arr1==arr3);

        System.out.println(arr1.equals(arr2));  //odjects.java -for referance

        String s1 = "Promod";
        String s2 = "promod";
        System.out.println(s1.equals(s2)); //content - Strings.java - comtent






    }



}
