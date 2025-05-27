package com.example.bookmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // get/set/equals/toString
@Entity  // Objekte in Datenbank speichern
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AutoIncrement
    private int id;


    private String title;
    private String author;
    private int year;
}
