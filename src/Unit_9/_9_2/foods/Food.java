package Unit_9._9_2.foods;

public class Food {

    private String name;
    private int calories;

    public Food (String foodName, int calories) {
        this.name = foodName;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }

    public String toString() {
        return this.name + " has " + this.calories + " calories";
    }
}
