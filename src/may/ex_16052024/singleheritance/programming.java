package may.ex_16052024.singleheritance;

public class programming {
    int version; //Instance varible
    String author;

    programming(){
        System.out.println("DC");
    }

    public programming(int version, String author) {
        this.version = version;
        this.author = author;
    }
    void printInfo(){
        System.out.println("Program Info ->  " +  this.version    + "Author"  +   this.author);
    }
    void bhk3(){
        System.out.println("3BHK");
    }
}
