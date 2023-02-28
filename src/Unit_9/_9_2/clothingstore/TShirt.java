package Unit_9._9_2.clothingstore;

public class TShirt extends Clothing{
    private String fabric;

    public TShirt(String size, String color, String fabric) {
        super(size, color);
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }
}
