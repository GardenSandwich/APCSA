package Unit_9._9_7.equalspart2;

public class Ball
{
    private double diameter;

    public Ball(double diameter){
        this.diameter = diameter;
    }

    public double getDiameter(){
        return diameter;
    }

    // Write an equals method here that returns true if
    // the diameters are the same.

    @Override
    public boolean equals(Object obj) {
        return this.diameter == ((Ball)obj).getDiameter();
    }


    // Write a toString statement here, in this format:
    // Diameter: 2.75
    @Override
    public String toString() {
        return "Diameter: " + this.diameter;
    }

}

