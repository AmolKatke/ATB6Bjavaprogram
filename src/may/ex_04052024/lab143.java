package may.ex_04052024;

public class lab143 {
    public static void main(String[] args) {
        String s1 = "Amol";
        String s2 = new String("Amol");

        //String -IMmutable -> Once created cant be changed.

        StringBuffer stringBuffer = new StringBuffer("Amol");
        stringBuffer.append("katke");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        //Ans is :  Amolkatke ans ulta type hot

        StringBuffer stringBuilder = new StringBuffer("Amol");
        stringBuilder.append("Amol");


    }
}
