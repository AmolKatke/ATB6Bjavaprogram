package may.ex_16052024.multilevelheritance.apiAutomation;

public class Test extends BaseTest{

    void accessExcelAndSQL(){
         openExcelFile();
         openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println();

    }
}
