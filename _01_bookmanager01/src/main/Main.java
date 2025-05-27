package main;

import model.Book;
import service.BookService;
import service.BookServiceImpl;


/*


 Teste den BookService, in dem du Bücher erzeugst und die BookService-Methoden
 aufrufst.
 Mache mit System.out.println einige Ausgaben
 */

public class Main {
    public static void main(String[] args) {



        BookService bookService = new BookServiceImpl();
        Book b1 = new Book(1,"JavaBuch","Max",2000);
        Book b2 = new Book(2,"JavaBuch","Ina",2023);
        Book b3 = new Book(4,"KochBuch2","Anna",1980);


        bookService.save(b1);
        bookService.save(b2);
        bookService.save(b3);


        System.out.println(bookService.getAll());

        System.out.println(bookService.getById(2));
        System.out.println(bookService.getByTitle("JavaBuch").size());

    }
}