package com.book.domain;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class Book {

    @JsonbTransient
    private String identifier;
    @JsonbProperty("author")
    private String writer;
    @JsonbProperty("country")
    private String country;
    @JsonbProperty("imageLink")
    private String imageLink;
    @JsonbProperty("title")
    private String title;
    @JsonbProperty("language")
    private String language;
    @JsonbProperty("link")
    private String link;
    @JsonbProperty("pages")
    private String numberOfPages;
    @JsonbProperty("year")
    private String publishYear;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        writer = writer;
    }

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
