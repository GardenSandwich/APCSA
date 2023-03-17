package Unit_9.labs.inheritancelabs.q1;

import java.text.DecimalFormat;

public class SimpleLunchItem {
    private String name;
    private double price;

    public SimpleLunchItem(String aName, double aPrice) {
        name = aName;
        price = aPrice;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public String toString () {
        DecimalFormat format = new DecimalFormat("0.00");;
        return getName() + " " + format.format(getPrice());
    }
}
