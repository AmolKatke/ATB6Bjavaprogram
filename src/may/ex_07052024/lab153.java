package may.ex_07052024;

public class lab153 {
    public static void main(String[] args) {
        //non return with no parameter
        saySomthingplease();
        //non return with paramter
        sayHelloToYou("Amol");
        //return with  no parameter
        sumofTwoBad(3,4);
        //return with parameter
        int result = sumofTwoGood(3,4); //mostly use this parameter
    }

    static int sumofTwoGood(int a, int b) {
        return (a+b);
    }

    static void sumofTwoBad(int a, int b) {
        System.out.println(a+b);
    }

    static void sayHelloToYou(String name) {
    System.out.println("Hello , " + name);
    }

    static void saySomthingplease() {
        System.out.println("non return with no parameter");
    }

}
