package Unit_5._5_4.achefsbestmeal;

public class Chef {
    private String name;
    private String restaurant;
    private Meal bestMeal;

    public Chef(String name, String restaurant, Meal bestMeal) {
        this.name = name;
        this.restaurant = restaurant;
        this.bestMeal = bestMeal;
    }

    public String getName() {
        return name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getMealName() {
        return bestMeal.getName();
    }

    public int getMealServings() {
        return bestMeal.getNumberOfServings();
    }

    public String getMealCourse() {
        return bestMeal.getCourse();
    }

    public String toString() {
        return "Chef " + name + " works at " + restaurant + " and their best meal is " + bestMeal.toString();
    }
}
