package Unit_9._9_2.foods;

public class FoodTester {
    public static void main(String[] args) {
        // Test each of your classes

        Food food = new Food("Apple", 100);
        HealthyFood healthyFood = new HealthyFood("Apple", 100, "Fruit", "Red");
        Fruit fruit = new Fruit("Apple", 100, "Red", true, "Vitamin C");

        // Make an object of each type
        // Use the getters to verify the fields are set correctly

        System.out.println(food);

        //getters
        System.out.println(food.getName());
        System.out.println(food.getCalories());

        System.out.println(healthyFood.getColor());
        System.out.println(healthyFood.getGroup());

        System.out.println(fruit.getVitamins());
        System.out.println(fruit.isInSeason());

    }
}
