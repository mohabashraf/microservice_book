package com.book.control;

import com.book.entity.Book;
import com.book.entity.Specification;

import java.util.UUID;

public class BookFactory {

    public BookFactory() {
    }

    public Book createBook(Specification specification) {
        Book book = new Book();
        book.setIdentifier(UUID.randomUUID().toString());
        book.setTitle(specification.getTitle());
        book.setWriter(specification.getWriter());
        return book;
    }
}