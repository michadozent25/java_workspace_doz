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
        Book b2 = new Book(2,"JavaBuch","Max",2000);


        bookService.save(b1);
        bookService.save(b2);
        System.out.println(bookService.getAll());


    }
}