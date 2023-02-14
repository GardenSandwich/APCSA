package Unit_8.labs.submittedversions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FancyWord {
    static void printAsHourGlass(String string){
        //create matrix and fill with spaces to be overwritten
        char[][] chars = new char[string.length()][string.length()];
        for (char[] line: chars) {
            Arrays.fill(line, ' ');
        }

        //set full word to both ends
        char[] fullWord = string.toCharArray();
        chars[0] = fullWord;
        chars[chars.length-1] = fullWord;

        //make hourglass
        for (int i = 1; i < string.length()-1; i++) {
            int reverseIndex = string.length()-1-i;
            chars[i][i] = fullWord[i];
            chars[i][reverseIndex] = string.charAt(i);
        }

        //print matrix
        for (char[] line : chars) {
            for (char character : line) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}

public class FancyWordRunner {
    public static void main(String[] args) {
        File input = new File("src/Unit_8/labs/fancyword/fancyword.txt");
        String currentLine;


        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            currentLine = reader.readLine();
            int dataLength = Integer.valueOf(currentLine);

            for (int i = 0; i < dataLength; i++) {
                currentLine = reader.readLine();
                FancyWord.printAsHourGlass(currentLine);
                System.out.println("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
