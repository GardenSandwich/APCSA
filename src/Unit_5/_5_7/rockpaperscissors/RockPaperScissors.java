package Unit_5._5_7.rockpaperscissors;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    public static String getWinner(String user, String computer)
    {
        if (user.equals("rock") && computer.equals("scissors"))
        {
            return USER_PLAYER;
        }
        else if (user.equals("rock") && computer.equals("paper"))
        {
            return COMPUTER_PLAYER;
        }
        else if (user.equals("paper") && computer.equals("rock"))
        {
            return USER_PLAYER;
        }
        else if (user.equals("paper") && computer.equals("scissors"))
        {
            return COMPUTER_PLAYER;
        }
        else if (user.equals("scissors") && computer.equals("paper"))
        {
            return USER_PLAYER;
        }
        else if (user.equals("scissors") && computer.equals("rock"))
        {
            return COMPUTER_PLAYER;
        }
        else
        {
            return TIE;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userInput = "null";
        int computerInput = 0;
        String computerChoice = "";
        while(!userInput.equals(""))
        {
            System.out.println("Enter your choice (rock, paper, or scissors");
            userInput = input.nextLine();
            computerInput = Randomizer.nextInt(1, 3);
            if (computerInput == 1)
            {
                computerChoice = "rock";
            }
            else if (computerInput == 2)
            {
                computerChoice = "paper";
            }
            else
            {
                computerChoice = "scissors";
            }
            System.out.println("User: " + userInput);
            System.out.println("Computer: " + computerChoice);
            System.out.println(getWinner(userInput, computerChoice));
        }
        System.out.println("Thanks for playing!");
    }
}
