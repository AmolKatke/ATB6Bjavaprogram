package may.ex_14052024;

public class BankAccount {
    String bankName;
    int balance;
    String bankcode;   //this three are class loader


    //default costructor
    BankAccount(){
        bankName = "SBI";
        bankcode = "SBI01";
        balance = 0;
    }
    //parameterized Costructor
    public BankAccount(String bankName,String bankcode) {
        this.bankName = bankName;
        this.bankcode = bankcode;
    }

    public BankAccount(String bankName, int balance, String bankcode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankcode = bankcode;
    }

    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank code -> " + bankcode);
        System.out.println("bal -> " + balance);


    }
}
