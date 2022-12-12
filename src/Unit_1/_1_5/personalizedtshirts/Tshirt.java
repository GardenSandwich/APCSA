package Unit_1._1_5.personalizedtshirts;

import java.util.Scanner;

public class Tshirt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cost of tshirt: ");
        int cost = input.nextInt();
        System.out.println("The t-shirt costs $" + cost++);
        System.out.println("A personalized t-shirt costs $" + cost--);
        System.out.println("Without personalization, the t-shirt costs $" + cost);
    }
}
