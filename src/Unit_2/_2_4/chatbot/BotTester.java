package Unit_2._2_4.chatbot;
import java.util.Scanner;

public class BotTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for name
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();

        //Create bot object
        Bot bot = new Bot(name);

        //Greet user
        bot.greeting();
        bot.help();

        //Imperial vs. Metric
        System.out.println("\nTell me Bot, which countries use the imperial system?");
        bot.imperialCountries();

        //First computer bug
        System.out.println("\nTell me Bot, what was the first computer bug?");
        bot.firstBug();

        //Goodbye message
        bot.goodbye();
    }
}
