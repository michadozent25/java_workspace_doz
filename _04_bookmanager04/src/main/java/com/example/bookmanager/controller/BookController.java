package com.example.bookmanager.controller;

import com.example.bookmanager.model.Book;
import com.example.bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RestFull-HTTP Methoden
 * -get  -> zum lesen (z.B. über Browser testen/aufrufen)
 * -post -> zum speichern
 * -put  -> für Update
 * -delete -> löschen
 */


@RestController
@RequestMapping("/api/books")// localhost:8080/api/books
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAll();
    }
    // localhost:8080/api/books/isbn/10-2323-23423
    @GetMapping("/isbn/{isbn}")
    public Book getByISBN(@PathVariable("isbn") String isbn){
        return bookService.getByISBN(isbn);
    }
    // Alternativ:
    // localhost:8080/api/books?isbn=10-2323-23423
    @GetMapping(params = "isbn")
    public Book getByISBN2(@RequestParam("isbn") String isbn){
        return bookService.getByISBN(isbn);
    }


    @PostMapping
    public Book createBook(@RequestBody Book book){
        System.out.println("Save Book");
        return bookService.save(book);
    }


//    @PutMapping("/{id}")
//    public Book updateBook(@PathVariable int id, @RequestBody Book updateBook){
//
//    }
}
