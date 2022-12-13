package Unit_3.Labs.conditionalstatement;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        float num = input.nextFloat();
        if (num > 0) System.out.println("The number is positive!");
        else if (num < 0) System.out.println("The number is negative!");
        else if (num == 0) System.out.println("The number is zero!");

        if (Math.abs(num) < 1) System.out.println("The number is small");
        else if (Math.abs(num) > 1000000) System.out.println("The number is large");
    }
}
