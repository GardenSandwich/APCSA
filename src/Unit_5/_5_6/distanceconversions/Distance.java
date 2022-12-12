package Unit_5._5_6.distanceconversions;

public class Distance {
    private double kilometers;


    public double getKilometers() {
        return this.kilometers;
    }

    public Distance(double kilometers) {
        this.kilometers = kilometers;
    }

    public double toMiles() {
        return this.getKilometers() / 1.609;
    }

    public double toLeagues() {
        return this.getKilometers() / 5.556;
    }

    public double doubleMiles() {
        return this.toMiles() * 2;
    }


}
