package Unit_7._7_5.fantasyfootballroster;

import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball {
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        String[] players = new String[5];

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (players[4] == null) {
            System.out.println("Enter name of player to add: ");
            String potentialPlayer = input.nextLine();
            if (search(availablePlayers, potentialPlayer) != -1){
                players[i] = potentialPlayer;
                availablePlayers.remove(potentialPlayer);
                i++;
                System.out.println("Successfully added player\n");
            }
            else {
                System.out.println(potentialPlayer + " is not an available player.\n");
            }
        }

        System.out.println("Final Team Roster: ");
        for(String player : players) {
            System.out.println(player);
        }
    }

    public static int search(ArrayList<String> array, String player)
    {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(player)) return i;
        }
        return -1;
    }

    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
