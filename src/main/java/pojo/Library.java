package pojo;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<Integer, Book> books;
    private static int book_id = 1;

    private int genBookId() {
        int retVal = book_id;
        book_id++;
        return retVal;
    }

    public Library() {
        books = new HashMap<>();
    }

    public Book addBook(Book book) {
        book.setId(genBookId());
        books.put(book.getId(), book);
        return book;
    }

    public Book[] getBooks() {
        return books.values().toArray(new Book[0]);
    }

    public void deleteAllBooks(){
        books.clear();
    }
}
