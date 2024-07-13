package may.ex_14052024;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;

public class AutomationClass {

    String name;

  // ** je pahje te pahile karun ghe u shakto
    // main function madhe run karu shakto
    // sagle he deafult constructor madhe astil

    AutomationClass(){
    databaseConnnection();
    excelopen();
    }

    public AutomationClass(String name) {
        this.name = name;
    }

    void databaseConnnection(){
        System.out.println("Mysql Connection is created");

    }

    void excelopen(){
        System.out.println("Excel open");
}
//befour this database and excel connection should be established

        void testcase1(){
            System.out.println("testcase1" + this.name);
    }
    void testcase2(){
        System.out.println("testcase2 " + this.name);
    }

    public static void main(String[] args) {
        AutomationClass tc1= new AutomationClass("TC1");
        AutomationClass tc2 = new AutomationClass("TC2");
        System.out.println(tc1.name);
        tc1.testcase1();
        tc1.testcase2();

        System.out.println(tc2.name);
        tc2.testcase1();
        tc2.testcase2();
        //befour stating to test

    }
}


