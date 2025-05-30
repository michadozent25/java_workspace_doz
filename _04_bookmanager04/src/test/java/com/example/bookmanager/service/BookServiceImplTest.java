package com.example.bookmanager.service;

import com.example.bookmanager.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //Starte im Springmodus
class BookServiceImplTest {


    @Autowired
    BookService   bookService;

    @Test
    void save() {
       Book b= bookService.save(new Book("Kochbuch","Anne"));

        System.out.println(b);

    }

    @Test
    void getAll() {
        System.out.println(bookService.getAll());
    }


    @Test
    void updateByTitle() {
        Book b= bookService.updateByTitle(1,"ein neuer Titel");
        System.out.println(b);
    }

    @Test
    void delete() {
        bookService.delete(1);
        //findById aufrufen
    }

    @Test
    void update() {
       Book b= bookService.update(1,new Book(1,"SDS42342","xxxx","yyyy",1900));
        System.out.println(b);
    }

    @Test
    void findByISBN() {
        System.out.println(bookService.findByISBN("SDS42342"));
    }
}