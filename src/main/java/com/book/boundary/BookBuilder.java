package com.book.boundary;

import com.book.control.BookFactory;
import com.book.control.BookRepository;
import com.book.domain.Book;
import com.book.domain.Specification;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class BookBuilder {

    @Inject
    BookFactory bookFactory;

    @Inject
    BookRepository bookRepository;
//
//    @Inject
//    BookCache bookCache;

    public Book bookBuilder(Specification specification){

        Book createdBook = bookFactory.createBook((specification));
        bookRepository.save(createdBook);
//        bookCache.cache(createdBook);
        return createdBook;

    }

    public List<Book> retrieveBooks(){
        return bookRepository.getBookRepo();
    }


    public Book retrieveBook(String identifier) {
        return bookRepository.getBook(identifier);
    }

    public void updateBook(String identifier) {
    }

    void deleteBook(String identifier) {
    }
}
