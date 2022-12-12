package Unit_5._5_5.rectangleclass;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);

        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());

        r1.setWidth(10);
        r1.setHeight(20);

        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}
