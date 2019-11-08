package com.book.domain;

public class Specification {

    private String title;
    private String author;
    private String country;
    private String imageLink;
    private String language;
    private String link;
    private int numberOfPages;
    private int publishYear;

    public Specification(){

    }
    public Specification(String title, String author, String country,
                         String imageLink, String language, String link,
                         int numberOfPages, int publishYear) {
                            this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
}
