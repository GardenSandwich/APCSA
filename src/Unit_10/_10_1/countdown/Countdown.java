package Unit_10._10_1.countdown;
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args)
    {
        System.out.println("Enter starting number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println(countdown(number));
    }

    public static String countdown(int number)
    {

        // Base case - return Blastoff!
        if (number<=0) {
            return "Blastoff!";
        }
        // Recursive call
        else{
            return number + " " + countdown(number - 2);
        }
    }
}
