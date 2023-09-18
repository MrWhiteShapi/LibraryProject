package com.company;

import java.util.UUID;

public class Book {
    private String title, author, publisher, uniqIdBook, typeOfBook;
    private int ageRaiting, year;
    {
        uniqIdBook = "IdBook" + UUID.randomUUID().toString();
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {return author;}

    public String getPublisher() {return publisher;}

    public String getUniqIdBook() {return uniqIdBook;}

    public String getTypeOfBook() {return typeOfBook;}

    public int getAgeRaiting() {return ageRaiting;}

    public int getYear() {return year;}

    protected Book(String title, String author, String publisher, String typeOfBook, int ageRaiting, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.typeOfBook = typeOfBook;
        this.ageRaiting = ageRaiting;
        this.year = year;
    }

    protected Book(String title, String author, int ageRaiting, int year) {
        this.title = title;
        this.author = author;
        this.ageRaiting = ageRaiting;
        this.year = year;
    }

}

class TechnicalBook extends  Book{
    private String typeTechincal;

    public TechnicalBook(String title, String author, int ageRaiting, int year, String typeTechincal) {
        super(title, author, ageRaiting, year);
        this.typeTechincal = typeTechincal;
    }
}

class EducationBook extends  Book{
    private String typeEducation;

    public EducationBook(String title, String author, int ageRaiting, int year, String typeEducation) {
        super(title, author, ageRaiting, year);
        this.typeEducation = typeEducation;
    }
}
class FictionBook extends Book{
    private String genreBook;

    public FictionBook(String title, String author, int ageRaiting, int year, String genreBook) {
        super(title, author, ageRaiting, year);
        this.genreBook = genreBook;
    }
}