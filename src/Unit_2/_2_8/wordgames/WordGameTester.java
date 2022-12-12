package Unit_2._2_8.wordgames;
import java.util.Scanner;

public class WordGameTester {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for a word
        System.out.print("Enter a word: ");
        WordGames game = new WordGames(input.nextLine());

        // Scramble it
        // Print out scrambled word
        System.out.println(game.scramble());
        // Ask for an index
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();

        // Ask for random word
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();

        // Add random word at index
        // Print out the word
        System.out.println(game.bananaSplit(idx, word));

        // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        String character = input.nextLine();
        // Ask for random word
        System.out.println("Enter another word: ");
        word = input.nextLine();

        // Add random word at character
        System.out.println(game.bananaSplit(character, word));




    }
}
