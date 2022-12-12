package Unit_1._1_6.castingtoadouble;
import java.util.Scanner;

public class CastingToDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First int pls: ");
        int firstInt = input.nextInt();
        System.out.print("\nSecond int pls: ");
        int secondInt = input.nextInt();
        System.out.println((double)firstInt/secondInt);
    }
}
