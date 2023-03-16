package Unit_9.labs.submittedversions;

public class Q2 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}

class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}
class MountainBike extends Bicycle {
    int SeatHeight;

    public MountainBike(int gear, int speed, int SeatHeight) {
        super(gear, speed);
        this.SeatHeight = SeatHeight;
    }

    public void setHeight(int seatHeight) {
        SeatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", with a seat height of " + SeatHeight + " inches.";
    }
}
