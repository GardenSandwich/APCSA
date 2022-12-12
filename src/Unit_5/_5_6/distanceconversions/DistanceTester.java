package Unit_5._5_6.distanceconversions;

public class DistanceTester {
    public static void main(String[] args) {
        Distance obj1 = new Distance(10.0);
        Distance obj2 = new Distance(20.0);
        Distance obj3 = new Distance(30.0);

        System.out.println(obj1.getKilometers() + "km = " + obj1.toMiles() + " miles");
        System.out.println(obj2.getKilometers() + "km = " + obj2.toLeagues() + " leagues");
        System.out.println(obj3.getKilometers() + "km (one way) = " + obj3.doubleMiles() + " miles (round trip)");
    }
}
