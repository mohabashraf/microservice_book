package com.book.control;

import com.book.domain.Book;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton
public class BookCache {

    private final Map<String, Book> cache = new HashMap<String, Book>();

    public BookCache(){

    }

    public List<Book> BookList() {
        return (List<Book>) cache.values();
    }

    public void cache(Book book){
        cache.put(book.getIdentifier(), book);
    }

}
