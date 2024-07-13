package may.ex_07052024;

public class lab155 {
    public static void main(String[] args) {
        // explaining of Return importance

        //1friend - money
        //1Beg - money
        System.out.println("Start of the Program");
        int money = giveMoneyFriend(100);
        givemoneyBeg();
        System.out.println("End of the program");
    }

    static void givemoneyBeg() {
        System.out.println("Blessing");
    }
//void funtion will not return anything
    static int giveMoneyFriend(int i) {
        //After 6 month u r friend give u money back
        return i;
    } //when int is there it will return

}
