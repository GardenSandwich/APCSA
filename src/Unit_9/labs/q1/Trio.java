package Unit_9.labs.q1;

public class Trio {
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
