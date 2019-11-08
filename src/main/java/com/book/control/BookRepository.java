package com.book.control;

import com.book.domain.Book;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class BookRepository {

    List<Book> bookRepo= new ArrayList<Book>();

    BookRepository(){

    }

    public List<Book> getBookRepo() {
        return bookRepo;
    }


    public void save(Book book){
        bookRepo.add(book);
        //..... add fuctionality call cloudant save
    }

    public Book getBook(String identifier) {
        for(Book book:bookRepo){
            if(book.getIdentifier().equals(identifier))
                return book;
        }
        return null;
    }
}
