package Unit_9._9_2.instruments;

public class Wind extends Instrument{
    private boolean hasReed;

    public Wind(String name, String family, boolean hasReed) {
        super(name, family);
        this.hasReed = hasReed;
    }

    public boolean isHasReed() {
        return hasReed;
    }

    public void setHasReed(boolean hasReed) {
        this.hasReed = hasReed;
    }


}
