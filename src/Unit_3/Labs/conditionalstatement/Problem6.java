package Unit_3.Labs.conditionalstatement;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println("Enter another number:");
        int num2 = input.nextInt();
        System.out.println("Enter a third number:");
        int num3 = input.nextInt();

        if(num1 == num2 && num2 == num3) System.out.println("All numbers are equal!");
        else if (num1 != num2 && num2 != num3 && num1 != num3) System.out.println("All numbers are different!");
        else System.out.println("Neither all are equal or different!");
    }
}
