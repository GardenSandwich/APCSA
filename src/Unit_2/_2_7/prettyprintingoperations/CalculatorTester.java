package Unit_2._2_7.prettyprintingoperations;
import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        //Calculate
        System.out.println(num1 + " + " + num2 + " = " + calc.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
    }
}
