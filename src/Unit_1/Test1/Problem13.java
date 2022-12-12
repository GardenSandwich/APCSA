package Unit_1.Test1;
import java.util.Scanner;
//Alex Zhang, P3

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        double first = input.nextDouble();
        System.out.print("\nSecond Number: ");
        double second = input.nextDouble();

        System.out.println(first + " x " + second + " = " + (first * second));
    }
}
