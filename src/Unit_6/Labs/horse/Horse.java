package Unit_6.Labs.horse;

public class Horse {
    private String name;

    private int weight;

    public Horse(String theName, int theWeight) {
        this.name = theName;
        this.weight = theWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }
}
