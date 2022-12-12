package Unit_5._5_6.foodappdemo;

public class Food {
    private String name;
    private int calories;


    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String toString() {
        return this.getName() + " have " + this.getCalories() + " calories";
    }
}
