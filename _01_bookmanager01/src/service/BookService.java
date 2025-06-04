package service;

import model.Book;

import java.util.List;
/**
Interface
- nur abstrakte Methoden
- beschreiben Methoden für UI/
 @author Micha

 */
public interface BookService {

    /**
     * Saves the given book to the database or storage.
     *
     * @param book the {@link Book} object to be saved
     * @return {@code true} if the book was successfully saved, {@code false} otherwise
     */
    boolean save(Book book);

    /**
     * Retrieves all books from the system.
     *
     * @return a {@link List} of all {@link Book} objects
     */
    List<Book> getAll();

    /**
     * Retrieves a book by its unique ID.
     *
     * @param id the ID of the book to retrieve
     * @return the {@link Book} with the specified ID, or {@code null} if not found
     */
    Book getById(int id);

    /**
     * Retrieves a list of books that match the given title.
     *
     * @param title the title of the books to search for
     * @return a {@link List} of {@link Book} objects with matching titles,
     * or an empty list if no matches are found
     */
    List<Book> getByTitle(String title);

}
