package Day23;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Enter Valid Password
//Should Have At Least 1 Upper Case
public class UserRegistration {
    public static boolean isValidUsername(String name)
    {

//        String regex = "[789]{1}[0-9]{9}";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]$";


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
        System.out.println("Enter Your Correct Password");
        String pass = sc.nextLine();
        System.out.println(isValidUsername(pass));
    }


}

