package org.example._11_booksfrontend.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example._11_booksfrontend.model.Book;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class BookClient {
    private static final String BASE_URL="http://localhost:8080/api/books";
    private HttpClient client = HttpClient.newHttpClient();
    private ObjectMapper mapper = new ObjectMapper();

    public List<Book> getAllBooks() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());// Json
        return mapper.readValue(response.body(), new TypeReference<>() {});
    }


    public void addBook(Book book) throws Exception{
        String json = mapper.writeValueAsString(book);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        client.send(request,HttpResponse.BodyHandlers.ofString());
    }
}
