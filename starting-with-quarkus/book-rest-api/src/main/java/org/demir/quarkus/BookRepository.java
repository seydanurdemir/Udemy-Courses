package org.demir.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    @ConfigProperty(name = "books.genre", defaultValue = "IT")
    String genre;

    public List<Book> getAllBooks() {
        return List.of(
                new Book(),
                new Book(1, "Quarkus 1", "Antonio", 2020, genre),
                new Book(2, "Quarkus 2", "Antonio", 2020, "IT"),
                new Book(3, "Quarkus 3", "Antonio", 2020, "IT"),
                new Book(4, "Quarkus 4", "Antonio", 2020, "IT")
        );
    }

    public Optional<Book> getBook(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}
