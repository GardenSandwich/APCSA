package Unit_6.Labs.rockpaperscissors;
import java.util.Scanner;

public class RockPaperScissors {
    //set of player score and the opponent move to let the player win
    private static final String[] moveSet = {"s", "r", "p"};

    private static String playerMove;
    private static String computerMove;

    private static int playerWins;
    private static int computerWins;

    public static void setPlayerMove(){
        Scanner input = new Scanner(System.in);
        //continue to ask until a valid input is entered
        do {
            System.out.println("Enter R for Rock, P for Paper, or S for Scissors");
            playerMove = input.nextLine().toUpperCase();
        } while (!playerMove.equals("R") && !playerMove.equals("P") && !playerMove.equals("S"));
    }

    public static String getPlayerMove(){
        return playerMove;
    }

    public static void setComputerMove() {
        computerMove = moveSet[(int) (Math.random() * 3)];
    }

    public static String getComputerMove() {
        return computerMove;
    }

    public static void incrementPlayerWins() {
        playerWins++;
    }

    public static int getPlayerWins() {
        return playerWins;
    }

    public static void incrementComputerWins() {
        computerWins++;
    }

    public static int getComputerWins() {
        return computerWins;
    }

    public static String judgeRound() {
        System.out.println("You played " + getPlayerMove());
        System.out.println("Computer played " + getComputerMove().toUpperCase());
        //check for tie
        if(getPlayerMove().equals(getComputerMove().toUpperCase())) {
            return "It's a tie";
        }

        //check for win
        if ((getPlayerMove().equals("R") && getComputerMove().equals(moveSet[0])) ||
                (getPlayerMove().equals("P") && getComputerMove().equals(moveSet[1])) ||
                (getPlayerMove().equals("S") && getComputerMove().equals(moveSet[2]))) {
            incrementPlayerWins();
            return "You win";
        }

        //return loss as default
        incrementComputerWins();
        return "Skill issue";
    }

    public static boolean quit() {
        Scanner input = new Scanner(System.in);
        String quit;
        System.out.println();
        do {
            System.out.println("Quit? (Y/N)");
            quit = input.nextLine();
        } while (!quit.equals("Y") && !quit.equals("N"));
        if(quit.equals("Y")) return true;
        return false;
    }

    public static String calculateOverallWinner() {
        System.out.println("\nComputer: " + getComputerWins() + "\nPlayer: " + getPlayerWins());
        if(getComputerWins() > getPlayerWins()) {
            return "Computer wins!";
        } else if (getPlayerWins() > getComputerWins()) {
            return "You win!";
        }

        return "You tied";
    }

    public static void main(String[] args) {

        while(true) {
            setPlayerMove();
            setComputerMove();
            System.out.println(judgeRound());
            if (quit()) break;
        }
        System.out.println(calculateOverallWinner());
    }
}
