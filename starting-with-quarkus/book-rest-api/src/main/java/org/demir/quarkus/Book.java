package org.demir.quarkus;

public class Book {
    public int id;
    public String title;
    public String author;
    public int yearOfPublication;
    public String genre;

    public Book() {
        this.id = 0;
        this.title = "Unknown";
        this.author = "Unknown";
        this.yearOfPublication = 1970;
        this.genre = "Unknown";
    }

    public Book(int id, String title, String author, int yearOfPublication, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }
}