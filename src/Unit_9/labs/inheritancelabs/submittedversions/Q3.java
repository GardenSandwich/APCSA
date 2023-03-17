package Unit_9.labs.inheritancelabs.submittedversions;

public class Q3 {
    public static void main(String[] args) {
        //Create a Book object
        Book book1 = new Book("Gary Rich", 8.99f, 19.99f, "How to get rich", 100);

        //Fetch Book Class specific fields from this book
        System.out.println("\n1) Book Details\n 1a) Author: " + book1.author + " | cost price: " + book1.costPrice + " | sale price:" + book1.salePrice + " | pages: " + book1.pages + " | title: " + book1.title + "\n");

        //Get Profit and Tax
        System.out.println(" 1a) Author " + book1.author + " nets a per-book profit of $" + book1.netProfit() + " and a tax of $" + book1.getTax());

        //Create an e-book object
        EBook book2 = new EBook("Seth Devilin", 10f, 23f, "Bad habits that lead to success", 200, "Amazon", 80);

        //Fetch Book Class specific fields from this ebook
        System.out.println("\n2) EBook Details\n 2a) Author: " + book2.author + " | cost price: " + book2.costPrice + " | sale price:" + book2.salePrice + " | pages: " + book2.pages + " | title: " + book2.title + "\n");

        //Get Profit and Tax
        System.out.println(" 2b) Author " + book2.author + " nets a per-book profit of $" + book2.netProfit() + " and a tax of $" + book2.getTax());

        //Get per page size
        System.out.println("\n 2c) Book \"" + book2.title + "\" has a per-page size of " + book2.pageSize() + " MB\n");
    }
}

class Book {
    public String author;
    public float costPrice;
    public float salePrice;
    public String title;
    public int pages;

    public Book(String au, float cp, float sp, String tl, int pg){
        author = au;
        costPrice = cp;
        salePrice = sp;
        title = tl;
        pages = pg;
    }

    //Compute net profit per book
    public float netProfit() {
        return (salePrice - costPrice);
    }

    //Compute tax on net profit per book @ 30%
    public float getTax() {
        return (0.3f*this.netProfit());
    }
}

class EBook extends Unit_9.labs.inheritancelabs.q3.Book {
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


