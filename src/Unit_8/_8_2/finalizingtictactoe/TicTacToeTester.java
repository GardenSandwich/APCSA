package Unit_8._8_2.finalizingtictactoe;
import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args)
    {
        while(true){
            TicTacToe board = new TicTacToe();

            Scanner input = new Scanner(System.in);

            while(board.getTurn() < 9)
            {
                board.printBoard();
                System.out.println("Enter a row and column (0-2) for player " + (board.getTurn() % 2 == 0 ? "X" : "O"));
                int row = input.nextInt();
                int col = input.nextInt();

                if(board.pickLocation(row, col))
                    board.takeTurn(row, col);
                else
                {
                    System.out.println("Invalid location!");
                    continue;
                }

                if(board.checkWin())
                {
                    board.printBoard();
                    System.out.println("Player " + (board.getTurn() % 2 == 0 ? "O" : "X") + " wins!");
                    break;
                }
            }
        }
    }
}
