package Unit_1._1_3.freelyfallingbodies;

public class FallingBodies {
    public static void main(String[] args) {
        final double GRAVITY = 9.8;
        double heightFromDrop;
        double velocity;

        double fallingTime = 23;
        heightFromDrop = 0.5 * GRAVITY * fallingTime * fallingTime;
        System.out.println("The height of the object is " + heightFromDrop + " meters.");
        velocity = GRAVITY * fallingTime;
        System.out.println("The velocity of the object is " + velocity + " m/s.");
    }
}
