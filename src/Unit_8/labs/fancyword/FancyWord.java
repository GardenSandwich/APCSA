package Unit_8.labs.fancyword;

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
