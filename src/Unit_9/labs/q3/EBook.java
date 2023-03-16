package Unit_9.labs.q3;

public class EBook extends Book {
    String downloadSite;

    int sizeMB;

    public EBook(String au, float cp, float sp, String tl, int pg, String ds, int sm) {
        super(au, cp, sp, tl, pg);
        downloadSite = ds;
        sizeMB = sm;
    }

    public float pageSize() {
        return (float) sizeMB / pages;
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public float getTax() {
        return (0.3f * this.netProfit()) + 2.0f;
    }
}
