package com.example.bookmanager.service;

import com.example.bookmanager.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class CSVBookService implements BookService{
    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return List.of();
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public List<Book> getByTitle(String title) {
        return List.of();
    }

    @Override
    public Book updateByTitle(int id, String newTitle) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Book update(int id, Book book) {
        return null;
    }

    @Override
    public Book getByISBN(String isbn) {
        return null;
    }
}
