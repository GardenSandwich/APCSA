package Unit_3._3_2.sweetorunsweet;
import java.util.Scanner;

public class DrinkOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int tsps = input.nextInt();
        System.out.print("\nConfirming your order. You wanted:\n" + drink);
        if(tsps > 0) System.out.println(" with sugar");
    }
}
