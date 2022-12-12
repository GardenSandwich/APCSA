package Unit_4._4_3.passwordchecker;
import java.util.Scanner;

//not even gonna actually do this one b/c codeHS is being a dick about my perfectly correct answer that I had before
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        System.out.println(passwordCheck(password));
    }
    public static boolean passwordCheck(String password) {

        if((password.length() < 8) || (password.contains("!")) || (password.contains("?")) || (password.contains(".")) || (password.contains(";")) || password.contains(":") || password.contains(" "))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
