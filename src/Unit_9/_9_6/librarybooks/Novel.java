package Unit_9._9_6.librarybooks;

public class Novel extends Book{
    int readingLevel;
    String genre;

    public Novel(String title, String author, int readingLevel, String genre) {
        super(title, author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }

    public int getReadingLevel() {
        return readingLevel;
    }

    public void setReadingLevel(int readingLevel) {
        this.readingLevel = readingLevel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.getGenre() + " Novel";
    }
}
