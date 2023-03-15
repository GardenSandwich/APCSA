package Unit_9._9_6.funwithsolids;

public class Pyramid extends Solid{
    double length;
    double width;
    double height;

    public Pyramid(String name, double length, double width, double height) {
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
        return (length * width * height) / 3;
    }

    public double surfaceArea(){
        return length * width + length * Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow(length/2, 2) + Math.pow(height, 2));
    }
}
