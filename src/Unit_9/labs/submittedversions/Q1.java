package Unit_9.labs.submittedversions;

import java.text.DecimalFormat;

public class Q1 {
    public static void main(String[] args) {
        Sandwich burger = new Sandwich("Cheeseburger",2.75);
        Sandwich club = new Sandwich("Club Sandwich", 2.75);
        Salad spinachSalad = new Salad("Spinach Salad",1.25);
        Salad coleslaw = new Salad("Coleslaw", 1.25);
        Drink orange = new Drink("Orange Soda", 1.25);
        Drink cap = new Drink("Cappuccino", 3.50);

        Trio trio1 = new Trio(burger,spinachSalad, orange);
        System.out.println("It should print Cheeseburger/Spinach Salad/Orange Soda and it prints: " + trio1.getName());
        System.out.println("It should print 4.0 and it prints: " + trio1.getPrice());

        Trio trio2 = new Trio(club,coleslaw,cap);
        System.out.println("It should print Club Sandwich/Coleslaw/Capuccino and it prints: " + trio2.getName());
        System.out.println("It should print 6.25 and it prints: " + trio2.getPrice());
    }
}

class Trio {
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    Double price;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
        this.price = calculatePrice();
    }

    private double calculatePrice(){
        double[] prices = {sandwich.getPrice(), salad.getPrice(), drink.getPrice()};

        double min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return sandwich.getPrice() + salad.getPrice() + drink.getPrice() - min;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
    }
}

class SimpleLunchItem {
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

class Sandwich extends SimpleLunchItem {
    public Sandwich(String name, double price) { super(name, price); }
}

class Salad extends SimpleLunchItem {
    public Salad(String name, double price) { super(name, price); }
}

class Drink extends SimpleLunchItem {
    public Drink(String name, double price) { super(name, price); }
}