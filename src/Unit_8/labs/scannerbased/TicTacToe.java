package Unit_8.labs.scannerbased;

import java.util.Scanner;

public class TicTacToe {
    public static void determineWinner(String game){
        char[] gameArray = game.toCharArray();

        //copy board into 2d array
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            board[0][i] = gameArray[i];
            board[1][i] = gameArray[i + 3];
            board[2][i] = gameArray[i + 6];
        }

        //print board
        printBoard(board);

        if (checkRow(board) != ' '){
            System.out.println(checkRow(board) + " wins horizontally!");
        } else if (checkCol(board) != ' '){
            System.out.println(checkCol(board) + " wins vertically!");
        } else if (checkDiag(board) != ' '){
            System.out.println(checkDiag(board) + " wins diagonally!");
        } else {
            System.out.println("Cat's game, no winner!");
        }
    }

    //methods for checking rows, columns, and diagonals
    private static char checkRow(char[][] board){
        for (char[] row : board){
            if (row[0] == row[1] && row[1] == row[2] ){
                return row[0];
            }
        }
        return ' ';
    }

    private static char checkCol(char[][] board){
        for (int i = 0; i < 3; i++){
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return board[0][i];
            }
        }
        return ' ';
    }

    private static char checkDiag(char[][] board){
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return board[0][2];
        }
        return ' ';
    }

    private static void printBoard(char[][] board){
        for (char[] row : board){
            for (char c : row){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a game as one line or \"quit\" to exit: ");
            String word = input.nextLine();
            if (word.equals("quit")) {
                break;
            }
            TicTacToe.determineWinner(word);
            System.out.println("\n");
        }
    }
}