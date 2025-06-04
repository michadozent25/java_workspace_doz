package com.example.bookmanager.service;

import com.example.bookmanager.model.Book;
import com.example.bookmanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service // kein Objekt erzeugen , @Autowired BookService
public class BookServiceImpl implements BookService{

    @Autowired  // holt Implementierung/ Objekt wird erzeugt - Dependency Injection
    private BookRepository repository;
    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override
    public Book getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getByTitle(String title) {
        return repository.findByTitleContaining(title);
    }

    @Override
    public Book updateByTitle(int id, String newTitle) {
      Book b=   repository.findById(id).orElse(null);
      if(b!=null) {
          b.setTitle(newTitle);
          return repository.save(b);
      }
      return null;

//        Optional<Book> o= repository.findById(id);
//        if(o.isPresent()){
//          Book b= o.get();
//          b.setTitle(newTitle);
//          repository.save(b);
//        }
//        return null;
    }

    @Override
    public void delete(int id) {

        repository.deleteById(id);
    }

    @Override
    public Book update(int id, Book book) {

        Book b = getById(id);
        if(b!=null){  //FIXME Fields prüfen!
            b.setIsbn(book.getIsbn());
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
            b.setYear(book.getYear());
           return repository.save(book);// save wirkt wie update
        }

        return null;
    }

    @Override
    public Book getByISBN(String isbn) {
       return repository.findByIsbnIgnoreCase(isbn);

    }
}
