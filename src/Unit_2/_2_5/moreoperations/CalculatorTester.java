package Unit_2._2_5.moreoperations;
import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        //Calculate
        Calculator calc = new Calculator();
        calc.sum(num1, num2);
        calc.subtract(num1, num2);
        calc.multiply(num1, num2);
        calc.divide(num1, num2);
    }
}
