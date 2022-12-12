package Unit_2._2_10.racing;

public class RaceMain {
    public static void main(String[] args) {
        // Length of the course in meters
        double raceDistance = 2414; // ~ 1.5 miles

        // Generate a random acceleration for each car
        Racecar car1 = new Racecar(Math.random() + 1, "Bob" );
        Racecar car2 = new Racecar(Math.random() + 1, "Joe" );

        // Compute the finishing times for both cars
        double time2 = car1.computeTime(raceDistance);
        double time1 = car2.computeTime(raceDistance);
        // Print times of each car
        System.out.println(car1 + " finished in " + time1 + " seconds.");
        System.out.println(car2 + " finished in " + time2 + " seconds.");
    }
}
