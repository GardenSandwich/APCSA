package Unit_2._2_6.constructioncosts;
import java.util.Scanner;

public class ConstructionTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        double taxRate = input.nextDouble();
        System.out.println("How many boards do you need?");
        int numBoards = input.nextInt();
        System.out.println("How many windows do you need?");
        int numWindows = input.nextInt();
        Construction total = new Construction(8, 11, taxRate);
        double subTotal = total.lumberCost(numBoards) + total.windowCost(numWindows);
        System.out.println("Total: " + subTotal);
        System.out.println("Grand Total: " + total.grandTotal(subTotal));
    }
}
