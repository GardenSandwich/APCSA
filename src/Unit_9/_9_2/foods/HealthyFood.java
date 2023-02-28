package Unit_9._9_2.foods;

public class HealthyFood extends Food{
    private String group;

    private String color;


    public HealthyFood(String foodName, int calories, String foodGroup, String foodColor) {
        super(foodName, calories);
        this.group = foodGroup;
        this.color = foodColor;
    }

    public String getGroup() {
        return group;
    }

    public String getColor() {
        return color;
    }

}
