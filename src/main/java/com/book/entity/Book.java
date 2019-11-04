package com.book.entity;

import javax.json.bind.annotation.JsonbAnnotation;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class Book {

    @JsonbTransient
    private String identifier;
    @JsonbProperty("title")
    private String title;


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
