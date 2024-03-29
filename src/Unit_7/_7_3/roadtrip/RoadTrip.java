package Unit_7._7_3.roadtrip;

import java.util.ArrayList;

public class RoadTrip {
    ArrayList<GeoLocation> stops = new ArrayList<>();

    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
        stops.add(new GeoLocation(name, latitude, longitude));
    }

    // Get the total number of stops in the trip
    public int getNumberOfStops() {
        return stops.size();
    }

    // Get the total miles of the trip
    public double getTripLength() {
        double total = 0;
        for (int i = 0; i < stops.size() - 1; i++) {
            total += stops.get(i).distanceFrom(stops.get(i + 1));
        }
        return total;
    }

    // Return a formatted toString of the trip
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stops.size(); i++) {
            result.append(i+1).append(". ").append(stops.get(i).toString()).append("\n");
        }
        return result.toString();
    }
}
