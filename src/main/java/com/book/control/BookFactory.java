package com.book.control;

import com.book.domain.Book;
import com.book.domain.Specification;

import javax.enterprise.context.Dependent;
import java.util.UUID;
@Dependent
public class BookFactory {

    public BookFactory() {
    }

    public Book createBook(Specification specification) {
        Book book = new Book();
        book.setIdentifier(UUID.randomUUID().toString());
        book.setTitle(specification.getTitle());
        book.setCountry(specification.getCountry());
        book.setImageLink(specification.getImageLink());
        book.setPublishYear(specification.getPublishYear());
        book.setLanguage(specification.getLanguage());
        book.setNumberOfPages(specification.getNumberOfPages());
        book.setLink(specification.getLink());
        book.setAuthor(specification.getAuthor());
        return book;
    }

}