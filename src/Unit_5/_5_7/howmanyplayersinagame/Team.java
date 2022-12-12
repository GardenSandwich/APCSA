package Unit_5._5_7.howmanyplayersinagame;

public class Team {
    public static int totalTeams = 0;
    public static int minTeams = 6;

    public Team() {
        totalTeams++;
    }

    public static boolean tournamentReady() {
        if (totalTeams >= minTeams) {
            return true;
        } else {
            return false;
        }
    }
}
