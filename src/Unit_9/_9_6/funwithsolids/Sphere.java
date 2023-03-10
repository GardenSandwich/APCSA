package Unit_9._9_6.funwithsolids;

public class Sphere extends Solid {
    double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume(){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
