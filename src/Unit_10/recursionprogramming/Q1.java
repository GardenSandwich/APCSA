package Unit_10.recursionprogramming;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("factorial of 1 using recursion: " + Factorial.recursiveFactorial(1));
        System.out.println("factorial of 1 using iteration: " + Factorial.iterativeFactorial(1));

        System.out.println("factorial of 5 using recursion: " + Factorial.recursiveFactorial(5));
        System.out.println("factorial of 5 using iteration: " + Factorial.iterativeFactorial(5));

        System.out.println("factorial of 7 using recursion: " + Factorial.recursiveFactorial(7));
        System.out.println("factorial of 7 using iteration: " + Factorial.iterativeFactorial(7));
    }
}

class Factorial {
    public static int recursiveFactorial(int number) {
        if (number == 1) return  1;
        else  return number * recursiveFactorial(number-1);
    }

    public static int iterativeFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

