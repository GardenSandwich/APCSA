package Unit_3.Labs.unit3practice;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number % 2 ==0) System.out.println("Number is even");
        else System.out.println("Number is odd");
    }
}
