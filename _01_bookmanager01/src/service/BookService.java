package service;

import model.Book;

import java.util.List;

public interface BookService {

    boolean save( Book book  );

    List<Book> getAll();

    Book getById(int id);

    List<Book> getByTitle(String title);
}
