package main;

import model.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Book b1 = new Book(1,"JavaBuch","Max",2000);
        Book b2 = new Book(2,"JavaBuch","Max",2000);

        System.out.println(b1.equals(b2));

    }
}