package Unit_3.Labs.conditionalstatement;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if (num > 0) System.out.println("The number is positive!");
        else if (num < 0) System.out.println("The number is negative!");
    }
}
