package Unit_4._4_3.replaceletter;
import java.util.Scanner;

//Fucking asshole problem man

public class Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = input.nextLine();

        System.out.println("Enter the letter you want to replace: ");
        String replaceOne = input.nextLine();

        System.out.println("Enter the replacing letter: ");
        String replaceTwo = input.nextLine();

        System.out.println(replaceLetter(word, replaceOne, replaceTwo));
    }

    public static String replaceLetter(String word, String letterToReplace, String replacement) {
        //split word to all letters past first occurrence and everything before
        String toReplace = word.substring(word.indexOf(letterToReplace) + 1);
        String original = word.substring(0, word.indexOf(letterToReplace) + 1 );

        return original + toReplace.replace(letterToReplace, replacement);
    }
}
