package Day23;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isValidUsername(String name)
    {

        String regex = "^[A-Za-z]\\w{5,29}$";

        Pattern p = Pattern.compile(regex);


        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);


        return m.matches();
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Last Name");
        String lname = sc.nextLine();
        System.out.println(isValidUsername(lname));
    }


}

