package Unit_2._2_9.guessthenumber;

import java.util.Scanner;

public class ExtremesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Extremes extremes = new Extremes();
        System.out.println("Enter a number: ");
        Integer number = input.nextInt();
        System.out.println("You need to multiply by " + extremes.maxQuotient(number));
        System.out.println("What do you think is the MIN_VALUE?");
        number = input.nextInt();
        System.out.println("You need to multiply by " + extremes.minQuotient(number));
    }
}
