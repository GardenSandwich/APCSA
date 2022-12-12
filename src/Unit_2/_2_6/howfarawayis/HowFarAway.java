package Unit_2._2_6.howfarawayis;
import java.util.Scanner;

public class HowFarAway {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double startLat = input.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double startLong = input.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double endLat = input.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLong = input.nextDouble();

        GeoLocation start = new GeoLocation(startLat, startLong);
        GeoLocation end = new GeoLocation(endLat, endLong);
        System.out.println("The distance is " + start.distanceFrom(end) + " miles.");
    }
}
