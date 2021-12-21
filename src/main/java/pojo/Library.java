package pojo;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private static int book_id = 1;

    private int genBookId() {
        int retVal = book_id;
        book_id++;
        return retVal;
    }

    public Library() {
        books = new ArrayList<>();
    }

    public Book addBook(Book book) {
        book.setId(genBookId());
        books.add(book);
        return book;
    }

    public Book[] getBooks() {
        return books.toArray(new Book[0]);
    }

    public void deleteAllBooks(){
        books.clear();
    }
}
