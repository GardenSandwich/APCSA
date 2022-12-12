package Unit_2._2_3.plaincoffee;
public class Coffee
{
    // Instance Variables
    private int brewStrength;
    private boolean sugar;
    private String milkType;

    // Add a constructor for a default coffee (no parameters)
    // to initialize the instance variables
    // to a default cup of coffee
    public Coffee()
    {
        brewStrength = 2;
        sugar = true;
        milkType = "nonfat";
    }

    // Specialized constructor
    public Coffee(int howStrong, boolean hasSugar, String milk)
    {
        brewStrength = howStrong;
        sugar = hasSugar;
        milkType = milk;
    }


    // String representation to print
    // Do not modify this function
    public String toString()
    {
        return "Coffee brewed to level " + brewStrength + " with " + milkType + " milk. Sugar? " + sugar;
    }

}
