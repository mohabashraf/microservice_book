package com.book.control;

import com.book.entity.Book;

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

}
