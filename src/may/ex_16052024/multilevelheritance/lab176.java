package may.ex_16052024.multilevelheritance;

public class lab176 {
    public static void main(String[] args) {
//      GrandFather grandFather =new GrandFather();
//      grandFather.home();
//
//      father father = new father();
//      father.home();
//
//      child child = new child();
//      child.home();

        // Dynamic Dispatch //
        //
GrandFather grandFather =new GrandFather();
GrandFather grandFather1 =new father();
GrandFather grandFather2 = new child();
   grandFather.home();

//   child c1 = new GrandFather();
//   father c2 = new GrandFather();
    }

}
