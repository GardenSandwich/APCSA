package Unit_5._5_4.fulldragonclass;

public class Dragon {
    private final String attack;
    private final int level;

    // Write the constructor here!
    public Dragon(int level, String attack) {
        this.level = level;
        this.attack = attack;
    }

    // Put getters here
    public String getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    // Put other methods here
    public String fight() {
        String string = "";
        for(int i = 0; i < level; i++)
        {
            string += attack;
        }
        return string;
    }


    // String representation of the object
    public String toString() {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }


}
