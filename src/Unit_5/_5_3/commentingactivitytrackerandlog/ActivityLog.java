package Unit_5._5_3.commentingactivitytrackerandlog;

public class ActivityLog {
    private double numHours;
    private double numMiles;

    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }

    /**
     * Adds the specified hours to the object's numHours variable, assuming that it is not null
     * @param hours hours to add to the current log
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }

    /**
     * Adds the specified hours to the object's numMiles variable, assuming that it is not null
     * @param miles
     */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }

    /**
     * Gets the number of miles stored
     * @return number of miles stored in numMiles
     */
    public double getMiles()
    {
        return numMiles;
    }

    /**
     * Gets number of hours stored
     * @return number of hours in numHours
     */
    public double getHours()
    {
        return numHours;
    }
}
