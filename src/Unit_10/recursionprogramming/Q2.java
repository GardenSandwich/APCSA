package Unit_10.recursionprogramming;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms to calculate: ");
        int terms = input.nextInt();
        for (int i = 1; i <= terms; i++) {
            System.out.print(Fibonacci.calculateFibonacci(i) + " ");
        }
    }
}

class Fibonacci {
    public static int calculateFibonacci(int term) {
        if (term == 0) return 0;
        else if (term == 1) return 1;
        else return calculateFibonacci(term - 1) + calculateFibonacci(term - 2);
    }
}

