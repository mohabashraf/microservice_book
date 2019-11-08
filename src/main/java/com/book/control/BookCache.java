package com.book.control;

import com.book.domain.Book;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// I need to set it as singeleton
@Dependent
public class BookCache {

    private final Map<String, Book> cache = new HashMap<String, Book>();

    public BookCache(){

    }

    public List<Book> BookList() {
        return new ArrayList<Book>(cache.values());
    }

    public void cache(Book book){
        cache.put(book.getIdentifier(), book);
    }
    public Book getBook(String identifier){
        return cache.get(identifier);
    }
    public void updateBook(String identifier, Book book){
         cache.replace(identifier, book);
    }
    public void deleteBook(String identifier){
        cache.remove(identifier);
    }

}
