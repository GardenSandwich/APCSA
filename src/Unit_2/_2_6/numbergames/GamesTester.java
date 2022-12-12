package Unit_2._2_6.numbergames;

public class GamesTester {
    public static void main(String[] args) {
        NumberGames game = new NumberGames(5);
        System.out.println(game.squareNumber());
        System.out.println(game.doubleNumber());
        System.out.println(game.squareNumber());
        double num = game.getNumber();
        System.out.println(num);
        num = game.getNumber();
        System.out.println(num);
    }



}
