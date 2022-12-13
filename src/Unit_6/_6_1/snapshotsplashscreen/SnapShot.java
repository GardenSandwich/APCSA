package Unit_6._6_1.snapshotsplashscreen;

public class SnapShot {
    public static void main(String[] args) {
        String[] lines = {"Welcome", "to" , "the snap shot", "app!"};
        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println();

        lines[0] = "Upgrade";
        lines[lines.length - 1] = "premium app!";

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
