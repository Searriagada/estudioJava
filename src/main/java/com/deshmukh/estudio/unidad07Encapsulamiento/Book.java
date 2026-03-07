package com.deshmukh.estudio.unidad07Encapsulamiento;

/**
 *
 * @author Usuario
 */
public class Book {
        
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    
    public Book(){
        this("book_isbn","book_tittle","book_author");
    }
    
    public Book(String isbn){}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    private static int noOfAuthors;

    public static int getNoOfAuthors() {
        return noOfAuthors;
    }
    
}
