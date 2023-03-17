package Unit_9.labs.inheritancelabs.q2;

public class MountainBike extends Bicycle{
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