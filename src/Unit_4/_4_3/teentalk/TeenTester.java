package Unit_4._4_3.teentalk;
import java.util.Scanner;

public class TeenTester {
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());
        Scanner input = new Scanner(System.in);
        // Ask the user to input a text message
        System.out.println("Type in your text message: ");
        String text = input.nextLine();
        // Call teenTalk method to translate the message to teen talk
        System.out.println(myFriend.teenTalk(text));
    }
}
