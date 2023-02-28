package Unit_9._9_2.instruments;

public class Strings extends Instrument{
    private boolean hasBow;

    public Strings(String name, boolean hasBow) {
        super(name, "Strings");
        this.hasBow = hasBow;
    }

    public boolean isHasBow() {
        return hasBow;
    }

    public void setHasBow(boolean hasBow) {
        this.hasBow = hasBow;
    }
}
