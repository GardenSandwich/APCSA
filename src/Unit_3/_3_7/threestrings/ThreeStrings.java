package Unit_3._3_7.threestrings;
import java.util.Scanner;

public class ThreeStrings {
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        final String companyCode = "1298";
        Scanner input = new Scanner(System.in);
        // Use comments to organize your logic before you start coding (as if)
        System.out.println("Enter your password:");
        String password = input.nextLine();
        System.out.println("Enter the company's secret code:");
        String code = input.nextLine();

        String correctPassword = password + companyCode;
        String enteredPassword = password + code;

        if (correctPassword.equals(enteredPassword)) System.out.println("Access granted");
        else System.out.println(enteredPassword + " is denied");
    }
}
