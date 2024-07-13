package April.ex_20042024;

public class lab064 {
    public static void main(String[] args) {
        String password = "Amol@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);

        //pass_u ==password ?
        //pass_u.equals(password);   --> No
        //pass_u.equalsIgnoreCase(password) -> yes
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));


        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf("o"));
        //index of is for position of the word in name
        //here amol@123 madhe  a=0,m=1,o=2,l=3 ans is 2,means position of "o" is 2nd











    }

}
