package Unit_8._8_1.tictactoeboard;

import java.util.Arrays;

public class TicTacToe {

    String[][] board = new String[3][3];

    public TicTacToe() {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], "-");
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
