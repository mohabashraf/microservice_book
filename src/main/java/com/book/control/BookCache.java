package com.book.control;

import com.book.entity.Book;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton
public class BookCache {

    private final Map<String, Book> cache = new HashMap<String, Book>();

    public List<Book> BookList() {
        return (List<Book>) cache.values();
    }

}
