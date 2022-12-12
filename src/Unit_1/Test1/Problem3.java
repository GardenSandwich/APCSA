package Unit_1.Test1;
//Alex Zhang, P3

public class Problem3 {
    public static void main(String[] args) {
        double gallonPrice = 2.35;
        int milesPerGallon = 40;
        int totalFunds = 8;
        double numGallons = totalFunds / gallonPrice;
        double numMiles = numGallons * milesPerGallon;
        System.out.println(numMiles);
    }
}
