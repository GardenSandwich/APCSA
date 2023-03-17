package Unit_9.labs.polymorphismlabs;

public class Q2 {
}

class IceCreamPricesWithConstructors {
    public static void main(String[] arg) {
        IceCream ic = new IceCream("Pista", 2);
        FruitSaladWithIceCream fs = new FruitSaladWithIceCream("Chocolate", 1, 50);
    }
}

class IceCream {
    String flavor;
    int numberOfScoops;

    IceCream(String flavor, int numberOfScoops) {
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
    }

    double getPrice() {
        double pricePerScoop = 5.0;
        return numberOfScoops * pricePerScoop;
    }
}

class FruitSaladWithIceCream extends IceCream {
    double gramsOfFruitSalad;

    public FruitSaladWithIceCream(String flavor, int numberOfScoops, double gramsOfFruitSalad) {
        super(flavor, numberOfScoops);
        this.gramsOfFruitSalad = gramsOfFruitSalad;
    }

    double getPrice(){
        return super.getPrice() + (2 * gramsOfFruitSalad);
    }
}