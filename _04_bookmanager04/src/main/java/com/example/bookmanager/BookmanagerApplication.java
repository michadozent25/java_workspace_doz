package com.example.bookmanager;

import com.example.bookmanager.model.Book;
import com.example.bookmanager.repository.BookRepository;
import com.example.bookmanager.service.BookServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BookmanagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookmanagerApplication.class, args);


	}

/*
	Spring-Applikationen starten in einem anderen Modus.
	Um Methoden zu Testen kann man einen CommandLineRunner benutzen
 */

//	@Bean
//	public CommandLineRunner run (BookRepository repository){
//
//		return args -> {
//			//repository.save(new Book("JavaBuch","Max Meier"));
//
//			/* Aufgabe:
//			Momentan können wir Bücher speichern.
//			Versuche die Funktionen für die folgenden Anforderungen herauszufinden:
//			>> testen mit System.out.println
//			1. Alle Bücher anzeigen
//			2. Buch per Id suchen
//			3. Bücher per Titel suchen
//
//			>> Bei 3. muss noch etwas mehr getan werden.
//			*/
//			List<Book> books = repository.findAll();
//			System.out.println(books);
//
//			Optional<Book> o = repository.findById(1);
//			System.out.println(o.get());
//
//			System.out.println("Bücher nach Title: " + repository.findByTitleContaining("JavaBuch"));
//		};
//
//	}

}
