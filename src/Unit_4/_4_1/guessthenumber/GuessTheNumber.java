package Unit_4._4_1.guessthenumber;
import java.util.Scanner;
public class GuessTheNumber {

    // This is the height of Mt. Everest.
    static int everestHeight = 8848;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");

        guessTheHeight();
    }

    public static void guessTheHeight()
    {
        int guess = 0;
        Scanner input = new Scanner(System.in);
        while(guess != everestHeight){
            System.out.println("Guess the height:");
            guess = input.nextInt();
            if(guess == everestHeight){
                System.out.println("Right! Mt. Everest is 8848 meters tall!");
                break;
            }
            else{
                System.out.println("That's not it!");
            }
        }
    }
}
