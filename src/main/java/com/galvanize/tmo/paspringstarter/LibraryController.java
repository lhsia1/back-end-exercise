package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import pojo.Book;
import pojo.Library;

@RestController
public class LibraryController {
    Library library = new Library();

    @GetMapping("/health")
    public void health() {

    }

    @PostMapping("/api/books")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        Book newBook = library.addBook(book);
        return newBook;
    }

    @GetMapping("/api/books")
    @ResponseStatus(code = HttpStatus.OK)
    public Book[] getBooks(){
        return library.getBooks();
    }

    @DeleteMapping("/api/books")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteAllBooks(){
        library.deleteAllBooks();
    }
}
