package Unit_4._4_1.maxandminvalues;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        int highest = 0;
        int lowest = 0;

        System.out.println("Enter a number or 0 to quit: ");
        num = input.nextInt();
        lowest = num;
        highest = num;
        while(num != 0){
            System.out.println("Results so far:");
            System.out.println("Largest number: " + highest);
            System.out.println("Smallest number: " + lowest);
            System.out.println("Enter a number or 0 to quit: ");
            num = input.nextInt();
            if(num < lowest) lowest = num;
            if(num > highest) highest = num;

        }
    }
}
