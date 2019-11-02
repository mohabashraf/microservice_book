package com.book.entity;

public class Specification {

    private final String title;
    private final Writer writer;


    public Specification(String title, Writer writer) {
        this.title = title;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public Writer getWriter() {
        return writer;
    }
}
