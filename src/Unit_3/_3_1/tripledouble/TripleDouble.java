package Unit_3._3_1.tripledouble;
import java.util.Scanner;
public class TripleDouble {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many points did you score?");
        int points = input.nextInt();
        System.out.println("How many rebounds did you score?");
        int rebounds = input.nextInt();
        System.out.println("How many assists did you score?");
        int assists = input.nextInt();
        System.out.println("You got 10 or more points: " + (points >= 10));
        System.out.println("You got 10 or more rebounds: " + (rebounds >= 10));
        System.out.println("You got 10 or more assists: " + (assists >= 10));
    }
}
