package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
Klasse für den Datenbankzugriff (DummyDB books)

 Ergänze die fehlenden Methoden
 */
public class BookRepository {
    static  ArrayList<Book> books = new ArrayList<>();  //DBDummy

    public boolean create(Book book){
       return books.add(book);
    }

    public List<Book> findAll(){
        return books;
    }

    public Book findById(int id){
      for(Book b: books){
          if(b.getId()==id){
              return b;
          }
      }
      return null;
    }

    public List<Book> findByTitle(String title){
        List<Book> result = new ArrayList<>();
        for (Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                result.add(book);
            }

        }
        return result;
    }


    public void deleteById(int id){
        books.removeIf(book -> book.getId()==id);
    }


}
