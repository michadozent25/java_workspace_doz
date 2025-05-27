package com.example.bookmanager;

import com.example.bookmanager.model.Book;
import com.example.bookmanager.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookmanagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookmanagerApplication.class, args);
	}

/*
	Spring-Applikationen starten in einem anderen Modus.
	Um Methoden zu Testen kann man einen CommandLineRunner benutzen
 */
	@Bean
	public CommandLineRunner run (BookRepository repository){

		return args -> {
			repository.save(new Book("JavaBuch","Max Meier"));

			/* Aufgabe:
			Momentan können wir Bücher speichern.
			Versuche die Funktionen für die folgenden Anforderungen herauszufinden:
			>> testen mit System.out.println
			1. Alle Bücher anzeigen
			2. Buch per Id suchen
			3. Bücher per Titel suchen

			>> Bei 3. muss noch etwas mehr getan werden.
			*/
		};

	}

}
