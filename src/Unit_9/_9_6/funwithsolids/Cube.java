package Unit_9._9_6.funwithsolids;

public class Cube extends RectangularPrism{
    public Cube(String name, double length) {
        super(name, length, length, length);
    }

    public double getLength() {
        return super.getLength();
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
        super.setHeight(length);
    }

    public double getWidth() {
        return super.getWidth();
    }

    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
        super.setHeight(width);
    }

    public double getHeight() {
        return super.getHeight();
    }

    public void setHeight(double height) {
        super.setLength(height);
        super.setWidth(height);
        super.setHeight(height);
    }

    public double volume(){
        return super.volume();
    }

    public double surfaceArea(){
        return super.surfaceArea();
    }
}
