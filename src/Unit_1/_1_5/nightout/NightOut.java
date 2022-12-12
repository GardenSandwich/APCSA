package Unit_1._1_5.nightout;
import java.util.Scanner;

public class NightOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much does dinner usually cost?");
        double dinnerPrice = input.nextDouble();
        System.out.println("How much laser tag for one person? ");
        double tagPrice = input.nextDouble();
        System.out.println("How much does a triple scoop cost?  ");
        double scoopPrice = input.nextDouble();

        //Print the bill
        System.out.println("\nDinner: $" + (dinnerPrice*2));
        System.out.println("Laser Tag: $" + (tagPrice*2));
        System.out.println("Ice-cream: $" + (scoopPrice*2));
        System.out.println("Grand Total: $" + ((dinnerPrice*3)+ (2*tagPrice)+ (scoopPrice* 4/3)));

    }
}
