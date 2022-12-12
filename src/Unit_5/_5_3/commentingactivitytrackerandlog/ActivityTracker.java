package Unit_5._5_3.commentingactivitytrackerandlog;

public class ActivityTracker {
    public static void main(String[] args) {
        // Create a new ActivityLog object
        ActivityLog mylog = new ActivityLog();

        // Add miles and hours to the ActivityLog object
        mylog.addMiles(5);
        mylog.addHours(1);

        // Print the total miles
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());

        //store number of hours
        double hoursToday = mylog.getHours();

        // Add more hours to the ActivityLog object
        mylog.addHours(1.5);
        mylog.addHours(3);

        // Calculate the increase in hours
        double increase = mylog.getHours() - hoursToday;

        // Print the increase in hours
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
