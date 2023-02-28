package Unit_9._9_3.squares;

public class SquareTester {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
        s.setSideLength(10);
        System.out.println(s);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
    }
}
