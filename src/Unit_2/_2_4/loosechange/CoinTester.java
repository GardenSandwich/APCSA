package Unit_2._2_4.loosechange;

public class CoinTester {
    public static void main(String[] args) {
        //Create coins object and print value
        Coins coins = new Coins(3, 2, 1, 4);
        coins.bankValue();
        //Add coins
        coins.addQuarter();
        coins.addQuarter();
        coins.addDime();
        coins.addPenny();
        coins.addPenny();
        coins.addPenny();
        //Print count and value
        coins.bankCount();
        coins.bankValue();


    }
}
