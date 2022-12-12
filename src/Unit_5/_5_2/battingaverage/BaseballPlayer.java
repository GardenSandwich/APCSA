package Unit_5._5_2.battingaverage;

public class BaseballPlayer {
    private int hits;
    private int atBats;
    private String name;

    public BaseballPlayer(String name, int hits, int atBats ) {
        this.hits = hits;
        this.atBats = atBats;
        this.name = name;
    }

    //Add constructor here

    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }

    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
}
