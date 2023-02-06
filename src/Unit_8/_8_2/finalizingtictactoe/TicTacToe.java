package Unit_8._8_2.finalizingtictactoe;

import java.util.Arrays;

public class TicTacToe {
    //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;

    String[][] board = new String[3][3];

    public TicTacToe() {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], "-");
        }
    }

    //this method returns the current turn
    public int getTurn()
    {
        return turn;
    }

    /*This method prints out the board array on to the console
     */
    public void printBoard()
    {
        System.out.println("  0 1 2");
        //print board spaces
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    //This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col)
    {
        return row < 3 && col < 3 && row >= 0 && col >= 0 && board[row][col].equals("-");
    }

    //This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col)
    {
        if(turn % 2 == 0)
            board[row][col] = "X";
        else
            board[row][col] = "O";

        turn++;
    }

    //This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow()
    {
        //check each row for all the same
        for (int row = 0; row < board.length; row++) {
            if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]) && !board[row][0].equals("-")) {
                return true;
            }
        }
        return false;
    }

    //This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol()
    {
        //check each column
        for (int col = 0; col < board.length; col++) {
            if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]) && !board[0][col].equals("-")) {
                return true;
            }
        }
        return false;
    }

    //This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag()
    {
        //check both diagonals
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("-")) {
            return true;
        } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("-")){
            return true;
        }
        return false;
    }

    //This method returns a boolean that checks if someone has won the game
    public boolean checkWin()
    {
        return checkCol() || checkDiag() || checkRow();
    }
}
