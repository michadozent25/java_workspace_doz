package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    static  ArrayList<Book> books = new ArrayList<>();  //DBDummy

    public boolean create(Book book){
       return books.add(book);
    }

    public List<Book> findAll(){
        return books;
    }


}
