package Unit_8.labs.fancyword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
