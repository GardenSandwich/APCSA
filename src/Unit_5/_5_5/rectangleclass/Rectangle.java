package Unit_5._5_5.rectangleclass;

public class Rectangle {
    private int width;
    private int height;

    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }


    // Put your methods here

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerimeter(){
        return 2 * (width + height);
    }

    public int getArea(){
        return width * height;
    }

    /**
     * This is the toString method. It returns a String
     * representation of the object.
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle height: " + height;
    }
}
