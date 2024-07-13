package April.ex_25042024;

import java.util.Scanner;

public class lab081 {
    public static void main(String[] args) {
        //I want AUtomation'
        //i will ask user which browser you want me to run the code
// chrome -> start chrome ,firefox -> firefox ,edge -> execution edge

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the brower name !!, where you want to execute the program");

String  browerName =sc.nextLine();
browerName = browerName.toLowerCase();
switch(browerName){
    case "chrome":
        System.out.println("starting the chrome browser");
        //further code to stert the chrome
        //eg. Web driver driver =new Chrome (); // selenium code
        break;
    case "firefox":
        System.out.println("starting the chrome browser");
        //further code to stert the chrome
        //eg. Web driver driver =new Chrome (); // selenium code
        break;
    default:
        System.out.println("i have not idea which brower is this");







}



    }
}
