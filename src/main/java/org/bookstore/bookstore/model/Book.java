package org.bookstore.bookstore.model;

/**
 * @author Ravanth Pasam
 *
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private int publishedYear;

    public Book(String id, String title, String author, int publishedYear) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publishedYear = publishedYear;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
}
