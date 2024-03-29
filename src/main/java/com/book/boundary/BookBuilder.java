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


    public Book bookBuilder(Specification specification){

        Book createdBook = bookFactory.createBook((specification));
        bookRepository.save(createdBook);
        return createdBook;

    }

    public List<Book> retrieveBooks(){
        return bookRepository.getBooks();
    }


    public Book retrieveBook(String identifier) {
        return bookRepository.getBook(identifier);
    }

    public void updateBook(String identifier, Book book)
    {
        bookRepository.updateBook(identifier, book);
    }

    public void deleteBook(String identifier) {
        bookRepository.deleteBook(identifier);
    }
}
