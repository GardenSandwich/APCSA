package Unit_2._2_10.theunitcircle;

public class UnitCircle {
    public static void main(String[] args) {
        System.out.println("Radians: (cos, sin)");
        System.out.println("0.0: " + Math.cos(0) + ", " + Math.sin(0));
        System.out.println(Math.PI/2 + ": " + (int) Math.cos((Math.PI)/2) + ", " + Math.sin(Math.PI/2));
        System.out.println(Math.PI + ": " + Math.cos(Math.PI) + ", " + (int) Math.sin(Math.PI));
    }
}
