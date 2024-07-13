package may.ex_07052024;

public class lab149 {
    public static void main(String[] args) {
        //Function which will say HI
        for (int i = 0; i <100 ; i++) {
            sayHI();        //we calling the function
            saybye();

        }
    }
// pahile satic void madhe lihl ki te function la dil ki valid hot run karnya sthi

    private static void saybye() {
        System.out.println("saybye");
    }

    static void sayHI(){
        System.out.println("Hello hi");
    }
}
