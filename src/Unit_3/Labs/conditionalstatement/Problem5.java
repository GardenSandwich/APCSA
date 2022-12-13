package Unit_3.Labs.conditionalstatement;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if (num < 1000000000) System.out.println(String.valueOf(num).length());
        else System.out.println("Number is too large!");
    }
}
