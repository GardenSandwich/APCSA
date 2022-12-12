package Unit_5._5_7.howmanyplayersinagame;

public class TeamTester {
    public static void main(String[] args) {
        //test out Team class
        Team team = new Team();
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        Team team4 = new Team();
        System.out.println("Total teams: " + Team.totalTeams);
        System.out.println("Tournament ready? " + Team.tournamentReady());
        Team team5 = new Team();
        System.out.println("Total teams: " + Team.totalTeams);
        System.out.println("Tournament ready? " + Team.tournamentReady());
    }
}
