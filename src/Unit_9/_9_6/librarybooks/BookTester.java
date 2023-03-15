package Unit_9._9_6.librarybooks;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        //add three textbooks and three novels
        books.add(new TextBook("Java for Dummies", "John Doe", 1, true));
        books.add(new TextBook("Beginning Java", "Jane Doe", 2, true));
        books.add(new TextBook("Java for Experts", "John Smith", 3, true));

        books.add(new Novel("The Hobbit", "J.R.R. Tolkien", 4, "Fantasy"));
        books.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 5, "Fantasy"));
        books.add(new Novel("The Silmarillion", "J.R.R. Tolkien", 6, "Fantasy"));

        //loop the arrayList and print out all book info
        for (Book book : books) {
            if(book instanceof TextBook) {
                System.out.println(book);
                System.out.println(book.getTitle());
                System.out.println(book.getAuthor());
                System.out.println(((TextBook) book).getEdition());
                System.out.println(((TextBook) book).isEbook);
            } else {
                System.out.println(book);
                System.out.println(book.getTitle());
                System.out.println(book.getAuthor());
                System.out.println(((Novel) book).getReadingLevel());
                System.out.println(((Novel) book).getGenre());
            }
        }
    }
}
