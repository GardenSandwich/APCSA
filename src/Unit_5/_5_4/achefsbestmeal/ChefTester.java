package Unit_5._5_4.achefsbestmeal;

public class ChefTester {
    public static void main(String[] args) {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);

        System.out.println(alex);
        System.out.println(alex.getMealName());

        // Create your own Meal and Chef here:
        Meal mysteryFood = new Meal("Mystery Food", "Dinner", 1);
        Chef gordonRamsay = new Chef("Gordon Ramsay", "McDonalds", mysteryFood);

        System.out.println(gordonRamsay.getMealName());
    }
}
