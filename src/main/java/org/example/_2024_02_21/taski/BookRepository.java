package main.java.org.example._2024_02_21.taski;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findById(String id);
    List<Book> findAll();
    Book save(Book book);
    void deleteById(String id);
    boolean existsById(String id);
    List<Book> findByAuthor(String author);
    Optional<Book> findByTitle(String title);
    List<Book> findContainingTitle(String title);
}
