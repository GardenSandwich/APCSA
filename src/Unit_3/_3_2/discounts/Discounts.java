package Unit_3._3_2.discounts;
import java.util.Scanner;

public class Discounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many hours were you parked? ");
        double hours = input.nextDouble();

        double total = hours * 4.25;

        if(total < 7) total = 7;

        if(hours > 3) total *= 0.75;

        System.out.println("You owe: $" + total);
    }
}
