package Unit_6._6_1.setscores;

public class Scores {
    public static void main(String[] args) {
        int[] scores = {80, 95, 82, 67, 100};
        for (int score : scores) {
            System.out.println(score);
        }

        System.out.println();

        scores[2] = 72;
        scores[scores.length -1] = 95;

        for (int score : scores) {
            System.out.println(score);
        }
    }
}
