package Unit_8.labs.tictactoe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TicTacToeRunner {
    public static void main(String[] args) {
        File input = new File("src/Unit_8/labs/tictactoe/games.dat");
        String currentLine;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            currentLine = reader.readLine();
            int dataLength = Integer.parseInt(currentLine);

            for (int i = 0; i < dataLength; i++) {
                currentLine = reader.readLine();
                TicTacToe.determineWinner(currentLine);
                System.out.println("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
