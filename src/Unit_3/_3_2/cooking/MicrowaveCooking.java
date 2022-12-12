package Unit_3._3_2.cooking;

public class MicrowaveCooking {
    public static void main(String[] args) {
        int time = (int) ((Math.random()*150)+90);
        System.out.println("Microwaving for " + time + " seconds");
        if(time <= 120) System.out.println("Rolls will be the right temperature!");
        if(time > 120) System.out.println("Rolls will be boiling hot!");
    }
}
