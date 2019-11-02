package com.book.boundary;

import com.book.control.BookFactory;
import com.book.control.BookRepository;
import com.book.entity.Book;
import com.book.entity.Specification;
import org.jetbrains.annotations.NotNull;

public class BookBuilder {

    private final BookFactory bookFactory = new BookFactory();
    private final BookRepository bookRepository = new BookRepository();

    public Book bookBuilder(Specification specification){

        Book createdBook = bookFactory.createBook((specification));

        return createdBook;
    }

    @NotNull
    private Book createBook(Specification specification) {
        return bookFactory.createBook(specification);
    }

}
