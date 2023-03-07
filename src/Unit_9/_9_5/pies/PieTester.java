package Unit_9._9_5.pies;

public class PieTester {
    public static void main(String[] args) {
        //create arraylist of pies and add some pies, then print their attributes with a loop
        Pie[] pies = new Pie[3];
        pies[0] = new ApplePie(5);
        pies[1] = new PecanPie(6, "Ketchup");
        pies[2] = new Pie("Salad", 7);

        for (Pie pie : pies) {
            System.out.println(pie.getSlices() + " slices " + pie.getType() + " pie");
        }

    }
}
