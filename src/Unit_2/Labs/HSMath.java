package Unit_2.Labs;
//Alex Zhang, P3

public class HSMath {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private static double discriminant(double a, double b, double c) {
        return (Math.pow(b, 2) - 4 * (a * c));
    }

    private static double round2(double value){
        return (Math.round(value*100))/100.0;
    }

    public static void quadratic(double a, double b, double c){
        double root1 = round2(((-1 * b) + Math.sqrt(discriminant(a,b,c)))/(2*a));
        double root2 = round2(((-1 * b) - Math.sqrt(discriminant(a,b,c)))/(2*a));
        System.out.println("x1 = " + root1 +", x2 = " + root2);
    }

    //Test
    public static void main(String[] args) {
        quadratic(1,10,16);
    }
}
