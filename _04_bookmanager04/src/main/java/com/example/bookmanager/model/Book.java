package com.example.bookmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Die Klasse Book wird als Entity konfiguriert und kann von JPA (Java Persistence API)
 * verwendet werden, um Objekte in der Datenbank zu speichern
 */
@NoArgsConstructor  //lombok
@AllArgsConstructor//lombok
@Data // get/set/equals/toString //lombok
@Entity  // Objekte in Datenbank speichern (JPA)
public class Book {

    @Id// Table
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement // Table
    private int id;


    @Column(length = 20,unique = true) //Field
    private String isbn;

    @Column(length = 100)
    private String title;
    @Column(length = 100)
    private String author;
    @Column(name = "publishing_year")
    private int year;//SQL-Keyword

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
