package com.book.boundary;

import com.book.control.BookFactory;
import com.book.control.BookRepository;
import com.book.entity.Book;
import com.book.entity.Specification;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class BookBuilder {

    @Inject
    BookFactory bookFactory;

    @Inject
    BookRepository bookRepository;

    public Book bookBuilder(Specification specification){

        Book createdBook = bookFactory.createBook((specification));
        bookRepository.save(createdBook);
        return createdBook;

    }

    public List<Book> retrieveBooks(){
        return bookRepository.getBookRepo();
    }


    public Book retrieveBook(String identifier) {
        return bookRepository.getBook(identifier);
    }
}
