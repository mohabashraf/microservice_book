package com.book.control;

import com.book.domain.Book;
import connection.Cloudant;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class BookRepository {

    @Inject
    BookCache bookCache;

    @Inject
    Cloudant cloudant;

    BookRepository(){

    }


    public void save(Book book){

        bookCache.cache(book);
    }

    public Book getBook(String identifier) {
        return bookCache.getBook(identifier);
    }

    public List<Book> getBooks(){
        return bookCache.BookList();
    }

    public void updateBook(String identifier, Book book) {
        bookCache.updateBook(identifier, book);
    }

    public void deleteBook(String identifier) {
        bookCache.deleteBook(identifier);
    }
}
