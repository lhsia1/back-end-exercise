package pojo;

import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void deleteAllBooks(){
        books.clear();
    }
}
