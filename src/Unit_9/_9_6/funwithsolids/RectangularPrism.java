package Unit_9._9_6.funwithsolids;

public class RectangularPrism extends Solid{
    double length;
    double width;
    double height;

    public RectangularPrism(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return length * width * height;
    }

    public double surfaceArea(){
        return 2 * ((length * width) + (length * height) + (width * height));
    }
}
