package Unit_3.Labs.unit3practice;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number == 0) System.out.println("Number is zero");
        else if (number > 0) System.out.println("Number is positive");
        else System.out.println("Number is negative");
    }

}
