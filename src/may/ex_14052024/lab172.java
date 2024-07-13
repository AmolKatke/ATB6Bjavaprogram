package may.ex_14052024;

public class lab172 {
    public static void main(String[] args) {
        BankAccount sbi_ref =new BankAccount();
        sbi_ref.printDetails();

        BankAccount hdfc_ref =new BankAccount("HDFC",0,"hdfc0123" );
        hdfc_ref.printDetails();

        BankAccount icici_ref =new BankAccount("ICICI",5361674,"icici0781" );
        icici_ref.printDetails();

        BankAccount yesbank_ref =new BankAccount("yesbank" , "icici0781" );
        yesbank_ref.printDetails();




    }


}
