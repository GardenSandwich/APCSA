package Unit_9._9_2.foods;

public class Fruit extends HealthyFood{
    private boolean inSeason;

    private String vitamins;

    public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins) {
        super(foodName, calories, "Fruit", foodColor);
        this.inSeason = isInSeason;
        this.vitamins = majorVitamins;
    }

    public boolean isInSeason() {
        return inSeason;
    }

    public String getVitamins() {
        return vitamins;
    }
}
