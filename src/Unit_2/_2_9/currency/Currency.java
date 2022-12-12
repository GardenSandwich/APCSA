package Unit_2._2_9.currency;

public class Currency {
    private Double value;

    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }

    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }

    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        return (int) value.doubleValue();
    }

    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        Integer numCent = null;
        return numCent.valueOf((int) (value * 100) % 100);
    }

    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}
