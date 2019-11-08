package com.book.domain;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class Book {

    @JsonbTransient
    private String identifier;
    @JsonbTransient
    private String cloudantIdentifier;
    @JsonbTransient
    private String cloudantRevision;
    @JsonbProperty("author")
    private String author;
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
    private int numberOfPages;
    @JsonbProperty("year")
    private int publishYear;

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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getCloudantIdentifier() {
        return cloudantIdentifier;
    }

    public void setCloudantIdentifier(String cloudantIdentifier) {
        this.cloudantIdentifier = cloudantIdentifier;
    }

    public String getCloudantRevision() {
        return cloudantRevision;
    }

    public void setCloudantRevision(String cloudantRevision) {
        this.cloudantRevision = cloudantRevision;
    }
}
