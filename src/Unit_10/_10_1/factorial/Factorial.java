package Unit_10._10_1.factorial;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        System.out.println(calcFactorial(number));
    }

    public static int calcFactorial(int x)
    {
        // Write a base case
        if(x == 1)
            return 1;
        // Call the simplified solution
        else return x * calcFactorial(x - 1);
    }
}

