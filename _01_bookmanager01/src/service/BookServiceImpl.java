package service;

import model.Book;
import repository.BookRepository;

import java.util.List;
/*
 Ruft Methoden von BookRepository
 - Alle Methoden aus BookRepository können angepasst/ ergänzt/ verbessert

 Aufgabe:
 Ergänze den fehlenden Code
 */
public class BookServiceImpl implements BookService{
    BookRepository repository = new BookRepository();

    @Override
    public boolean save(Book book) {
        //prüfen if ...
        return repository.create(book);
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public List<Book> getByTitle(String title) {
        return List.of();
    }
}
