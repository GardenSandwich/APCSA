package Unit_9._9_3.squares;

public class Square extends Rectangle{
    // Call to the Rectangle constructor
    public Square(double sideLength){
        super(sideLength, sideLength);
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){
        super.setHeight(sideLength);
        super.setWidth(sideLength);
    }

    // Get the width and/or the height from the superclass
    public double area(){
        return super.getHeight() * super.getWidth();
    }

    // Get the width and/or the height from the superclass
    public double perimeter(){
        return 2 * (super.getHeight() + super.getWidth());
    }

    // Override to read: ___ x ____ Square
    public String toString(){
        return super.getWidth() + " x " + super.getHeight() + " Square";
    }
}
