package Unit_5._5_6.foodappdemo;
import java.util.Scanner;

public class FoodRunner {
    public static void main(String[] args) {
        int totalCalories = 0;

        Scanner input = new Scanner(System.in);
        Food obj1 = new Food("Pizza", 500);
        Food obj2 = new Food("Burger", 400);
        Food obj3 = new Food("Fries", 300);

        System.out.println(obj1);
        System.out.println("How many would you like?");
        totalCalories += input.nextInt() * obj1.getCalories();

        System.out.println(obj2);
        System.out.println("How many would you like?");
        totalCalories += input.nextInt() * obj2.getCalories();

        System.out.println(obj3);
        System.out.println("How many would you like?");
        totalCalories += input.nextInt() * obj3.getCalories();

        System.out.println("Your meal will have a total of " + totalCalories + " calories");
    }
}
