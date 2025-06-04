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


    /**
     *
     * @param book -
     * @return boolean if saved in db
     */
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
        return repository.findById(id);
    }

    @Override
    public List<Book> getByTitle(String title) {
        return repository.findByTitle(title);
    }
}
