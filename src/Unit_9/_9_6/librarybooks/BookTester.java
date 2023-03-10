package Unit_9._9_6.librarybooks;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 10, "Fantasy"));
        books.add(new TextBook("Java for Dummies", "John Doe", 3, true));

        //add two more text books and two more novels
        books.add(new TextBook("C# for Dummies", "Your Mom", 3, true));

        //print out all book info
        System.out.println(books.get(0).toString());
        System.out.println(books.get(0).getTitle());
        System.out.println(books.get(0).getAuthor());

        System.out.println(books.get(1).toString());
        System.out.println(books.get(1).getTitle());
        System.out.println(books.get(1).getAuthor());
        System.out.println( ((Novel) books.get(1)).getReadingLevel());
        System.out.println(((Novel) books.get(1)).getGenre());

        System.out.println(books.get(2).toString());
        System.out.println(books.get(2).getTitle());
        System.out.println(books.get(2).getAuthor());
        System.out.println(((TextBook) books.get(2)).getEdition());
        System.out.println(((TextBook) books.get(2)).isEbook());
    }
}
