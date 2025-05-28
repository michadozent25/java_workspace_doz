package com.example.bookmanager.service;

import com.example.bookmanager.model.Book;

import java.util.List;

;


public interface BookService {

    Book save(Book book  );

    List<Book> getAll();

    Book getById(int id);

    List<Book> getByTitle(String title);

    Book updateByTitle(int id,String newTitle);

    // hier weitere: deleteById, update(),...
    // Aufgabe: Implementiere und teste diese Methoden
//    void delete(int id);
//
//    Book update(Book book);
//
//    Book findByISBN(String isbn);
}
