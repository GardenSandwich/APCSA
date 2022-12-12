package Unit_2._2_5.chatbot2_0;
import java.util.Scanner;

public class Bot2Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        Bot2 bot = new Bot2(input.nextLine());

        //Main Chat
        bot.greeting();

        System.out.println("What is your favorite animal?");
        bot.favoriteAnimal(input.nextLine());

        System.out.println("If you could visit any place, where would you go? ");
        bot.destination(input.nextLine());

        System.out.println("What is your favorite number? ");
        bot.favoriteNumber(input.nextInt());

        bot.goodbye();

    }
}
