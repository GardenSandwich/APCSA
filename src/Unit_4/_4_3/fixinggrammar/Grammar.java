package Unit_4._4_3.fixinggrammar;
import java.util.Scanner;

public class Grammar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        System.out.println(useProperGrammar(text));
    }

    public static String useProperGrammar(String text) {
        int occurences = 0;
        for (int i = 0; i < text.length(); i++) {
            if ('2' == text.charAt(i)) {
                occurences++;
            }
        }

        return "Fixed " + occurences +  " grammatical errors:" + text.replace("2", "to");

    }
}
