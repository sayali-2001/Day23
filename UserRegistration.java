package Day23;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Enter Valid Emails

public class UserRegistration {
    public static boolean isValidUsername(String name)
    {

//        String regex = "[789]{1}[0-9]{9}";
//        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).(?=.*[-+_!@#$%^&*.,?])+$";
String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

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
        System.out.println("Enter Your Emails");
        String pass = sc.nextLine();
        System.out.println(isValidUsername(pass));
    }


}

