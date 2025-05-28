package com.example.bookmanager.service;

import com.example.bookmanager.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
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
}