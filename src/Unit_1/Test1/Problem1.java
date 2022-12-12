package Unit_1.Test1;
//Alex Zhang, P3

public class Problem1 {
    public static void main(String[] args) {
        int tripMiles = 300;
        double price = 2.50;
        int milesPerGallon = 30;
        double numberOfGallons = (double) tripMiles / milesPerGallon;
        double totalCost = numberOfGallons * price;
        System.out.println(totalCost);
    }
}
