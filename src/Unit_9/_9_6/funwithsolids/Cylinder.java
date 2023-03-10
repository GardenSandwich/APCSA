package Unit_9._9_6.funwithsolids;

public class Cylinder extends Solid {
    double radius;
    double height;

    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
}
