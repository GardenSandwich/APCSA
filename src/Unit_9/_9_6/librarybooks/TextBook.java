package Unit_9._9_6.librarybooks;

public class TextBook extends Book{

    // Start here!
    int edition;
    boolean isEbook;

    public TextBook(String title, String author, int edition, boolean isEBook) {
        super(title, author);
        this.edition = edition;
        this.isEbook = isEbook;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean Ebook) {
        isEbook = Ebook;
    }

    @Override
    public String toString() {
        return "Textbook edition # " + this.getEdition();
    }
}
