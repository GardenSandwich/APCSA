package Unit_3.Labs.conditionalstatement;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println("Enter another number:");
        int num2 = input.nextInt();
        System.out.println("Enter a third number:");
        int num3 = input.nextInt();

        System.out.println(Math.max(num1, Math.max(num2, num3)));
    }
}
