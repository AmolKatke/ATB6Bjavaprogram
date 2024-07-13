package may.ex_07052024;

public class lab157 {
    public static void main(String[] args) {
        //can i create the main funtion out of thw class
        //Ans is "NO"
        // we are calling f1
        //jvm serch f1 ,but in line no 11 f1 calling f2
        //so 1st f2 by line no 16 will print and then f1 line 13
f1();
String[] names ={"Amol","katke"};
String[]names2 = new String[20];
names[0] = "Asha";
names[1] = "Rama";
f1(names);
//parameter - any data type
//primitive - byte ,short ,long ,float ,int ,boolean
        //non-Primitive = String Array
    }

 static void f1 (String[] a ) {
//for (String name :a){
//    System.out.println(name);
//
//}
     for (int i = 0; i <a.length ; i++) {
         System.out.println(a[i]);

     }
    }
    static void f1 (){
        f2();
        System.out.println("f1 ");
    }
    static void f2() {
        System.out.println("f2");
    }
}
