package Unit_3._3_1.sugartax;
import java.util.Scanner;

public class AddedSugar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many grams of sugar have you eaten today?");
        int sugar = input.nextInt();
        System.out.println("You can eat more sugar: " + (sugar < 30));
    }
}
