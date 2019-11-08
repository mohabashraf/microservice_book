package com.book.domain;

public class Specification {

    private String title;
    private String writer;
    private String country;
    private String imageLink;
    private String language;
    private String link;
    private String numberOfPages;
    private String publishYear;

    public Specification(){

    }
    public Specification(String title, String writer, String country,
                         String imageLink, String language, String link,
                         String numberOfPages, String publishYear) {
                            this.writer = writer;
                            this.country = country;
                            this.title = title;
                            this.imageLink = imageLink;
                            this.language = language;
                            this.link = link;
                            this.numberOfPages = numberOfPages;
                            this.publishYear = publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
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
}
