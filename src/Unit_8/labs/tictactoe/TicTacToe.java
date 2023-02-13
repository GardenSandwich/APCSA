package Unit_8.labs.tictactoe;

public class TicTacToe {
    public static void determineWinner(String game){
        char[][] board = new char[3][3];
        char[] gameArray = game.toCharArray();
        
        //copy board into 2d array
        for (int i = 0; i < 3; i++) {
            board[i][0] = gameArray[i];
            board[i][1] = gameArray[i + 3];
            board[i][2] = gameArray[i + 6];
        }

        //print board
        printBoard(board);

        if (checkRow(board) != ' '){
            System.out.println(checkRow(board) + " wins horiontally!");
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
