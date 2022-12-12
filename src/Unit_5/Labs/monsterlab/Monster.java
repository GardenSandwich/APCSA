package Unit_5.Labs.monsterlab;

public class Monster {
    private int size;
    private String name;

    public Monster(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBigger(Monster other) {
        return this.size > other.size;
    }

    public boolean isSameName(Monster other) {
        return this.name.equals(other.name);
    }
}
