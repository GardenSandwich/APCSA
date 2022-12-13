package Unit_6.Labs.horse;

public class HorseBarn {
    private final Horse[] spaces;

    /**
     * Constructor that takes the number of stalls
     *
     * @param numStalls - the number of stalls in the barn
     */

    public HorseBarn(int numStalls) {
        spaces = new Horse[numStalls];
    }

    /**
     * Returns the index of the space that contains the horse with the specified name.
     * * Precondition: No two horses in the barn have the same name.
     *
     * @param name the name of the horse to find
     * @return the index of the space containing the horse with the specified name;
     * -1 if no horse with the specified name is in the barn.
     */

    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].getName() == name) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        HorseBarn barn = new HorseBarn(3);
        barn.spaces[0] = new Horse("Trigger", 1340);
        barn.spaces[1] = new Horse("Silver", 1210);
        barn.spaces[2] = new Horse("Duke", 1410);
        System.out.println("Index of Trigger should be 0 and is " + barn.findHorseSpace("Trigger"));
        System.out.println("Index of Silver should be 1 and is " + barn.findHorseSpace("Silver"));
        System.out.println("Index of Coco should be -1 and is " + barn.findHorseSpace("Coco"));
    }
}
