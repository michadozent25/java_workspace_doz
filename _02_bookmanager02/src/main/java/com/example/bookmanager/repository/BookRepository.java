package com.example.bookmanager.repository;

import com.example.bookmanager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByTitleIgnoreCase(String title);

    /**
     *
     * @param title
     * @return all Books
     */
    List<Book> findByTitleContaining(String title);

}
