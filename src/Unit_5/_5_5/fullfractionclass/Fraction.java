package Unit_5._5_5.fullfractionclass;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void add(Fraction other) {
        this.numerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        this.denominator = this.denominator * other.denominator;
    }

    public void subtract(Fraction other) {
        this.numerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        this.denominator = this.denominator * other.denominator;
    }

    public void multiply(Fraction other) {
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }
}
