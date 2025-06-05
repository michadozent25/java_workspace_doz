package org.example._11_booksfrontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example._11_booksfrontend.client.BookClient;
import org.example._11_booksfrontend.model.Book;

import java.util.List;

public class HelloController {
    private BookClient client = new BookClient();

    @FXML
    private TextField authorField;

    @FXML
    private TextArea booksArea;

    @FXML
    private TextField isbnField;

    @FXML
    private TextField titleField;

    @FXML
    void onSave(ActionEvent event) {

        Book book = new Book(isbnField.getText(), titleField.getText(), authorField.getText());
        try {
            client.addBook(book);
            booksArea.clear();
            initialize();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void initialize(){
        try {
            List<Book> books = client.getAllBooks();
            for (Book b:books){
                booksArea.appendText(b+"\n");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
