package com.book.boundary;

import com.book.control.BookFactory;
import com.book.control.BookRepository;
import com.book.entity.Book;
import com.book.entity.Specification;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class BookBuilder {

    @Inject
    BookFactory bookFactory;

    @Inject
    BookRepository bookRepository;

    public Book bookBuilder(Specification specification){

        Book createdBook = bookFactory.createBook((specification));
        bookRepository.save();
        return createdBook;

    }

    public List<Book> retrieveBooks(){
        return BookRepository.loadBooks();
    }

}
