package Unit_5._5_1.fixingcircle;

public class Circle {
    private double radius;
    private double diameter;

    public Circle(double myRadius) {
        radius = myRadius;
        diameter = 2 * myRadius;
    }

    public void setRadius(int myRadius){
        radius = myRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius*2;
    }

    public double getPerimeter() {
        return Math.PI * diameter;
    }
    public String toString() {
        return "Circle with a radius of " + radius;
    }
}
