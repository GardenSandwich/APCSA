package Unit_3._3_5.findthemedian;
import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int median = 0;
        if (num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3) median = num1;
        else if (num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3) median = num2;
        else median = num3;
        System.out.println("The median is " + median);
    }
}
