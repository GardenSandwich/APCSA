package Unit_2._2_5.cricketplayers;

public class PlayerTester {
    public static void main(String[] args) {
        //Create two players
        CricketPlayer player1 = new CricketPlayer("John", "Bruhs");
        CricketPlayer player2 = new CricketPlayer("Jane");

        //Add four matches to each player
        player1.addMatch(1, 2);
        player1.addMatch(5, 6);
        player1.addMatch(9, 10);
        player1.addMatch(13, 14);

        player2.addMatch(3, 4);
        player2.addMatch(7, 8);
        player2.addMatch(11, 12);
        player2.addMatch(15, 16);

        //Print player 1's stats
        System.out.println("John's Stats:");
        player1.printRunsScored();
        player1.printBallsBowled();
        System.out.println(player1 + "\n");

        //Print player 2's stats
        System.out.println("Jane's Stats:");
        player2.printRunsScored();
        player2.printBallsBowled();
        System.out.println(player2);

    }
}
