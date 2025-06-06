package org.example._11_booksfrontend;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example._11_booksfrontend.client.BookClient;
import org.example._11_booksfrontend.model.Book;

import java.util.List;

public class BookClientController {


    @FXML
    private ListView<Book> listView;

    private BookClient client = new BookClient();

    @FXML
    private TextField authorField;

    // @FXML
    //  private TextArea booksArea;

    @FXML
    private TextField isbnField;

    @FXML
    private TextField titleField;

    @FXML
    void onSave(ActionEvent event) {

        Book book = new Book(isbnField.getText(), titleField.getText(), authorField.getText());
        try {
            client.addBook(book);
            listView.getItems().clear();
            initialize();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void initialize() {
        try {
            List<Book> books = client.getAllBooks();
            for (Book b : books) {
                //booksArea.appendText(b+"\n");
                listView.getItems().add(b);
            }

        } catch (Exception e) {
            message();
        }
//
    }

    private static void message() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Verbindungsfehler");
        alert.setContentText("Zuerst Backend starten, dann Client neu starten!");
        alert.showAndWait();
        Platform.exit();
    }


    /**
     * TODO extract
     * @param actionEvent
     */
    public void onDelete(ActionEvent actionEvent) {
        Book book = listView.getSelectionModel().getSelectedItem();
        listView.getItems().remove(book);
        // hier dann bookClient.remove(book)

    }
}
