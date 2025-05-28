package com.example.bookmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Die Klasse Book wird als Entity konfiguriert und kann von JPA (Java Persistence API)
 * verwendet werden, um Objekte in der Datenbank zu speichern
 */
@NoArgsConstructor
@AllArgsConstructor
@Data // get/set/equals/toString
@Entity  // Objekte in Datenbank speichern
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement
    private int id;

    @Column(length = 100)
    private String title;
    @Column(length = 100)
    private String author;
    @Column(name = "publishing_year")
    private int year;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
