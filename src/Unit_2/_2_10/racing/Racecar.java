package Unit_2._2_10.racing;

public class Racecar {
    // Instance variables
    private double accel; // acceleration
    private String name; // name of driver

    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }

    // Returns the time it takes the racecar
    // to complete the track rounded to 2 decimals
    public double computeTime(double distance)
    {
        return Math.round(Math.sqrt(2 * distance / accel) * 100)/100.0;
    }

    public String toString()
    {
        return "Racer " + name;
    }

}
