package Unit_9._9_2.clothingstore;

public class ClothingTester {
    public static void main(String[] args) {
        Clothing[] clothes = new Clothing[4];
        clothes[0] = new Sweatshirt("M", "Red", true);
        clothes[1] = new TShirt("L", "Blue", "Cotton");
        clothes[2] = new Jeans("M");
        clothes[3] = new Jeans("L");

        for (Clothing c : clothes) {
            System.out.println(c);
        }
    }
}
