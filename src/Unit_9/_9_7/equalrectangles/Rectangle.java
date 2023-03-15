package Unit_9._9_7.equalrectangles;

public class Rectangle{

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        return this.height == ((Rectangle)obj).height && this.width == ((Rectangle)obj).width;
    }

    @Override
    public String toString() {
        return "A rectangle with a width of " + this.width + " and a height of " + this.height;
    }
}
