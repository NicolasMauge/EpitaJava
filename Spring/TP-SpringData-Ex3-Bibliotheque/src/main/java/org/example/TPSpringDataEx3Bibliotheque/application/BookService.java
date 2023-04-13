package org.example.TPSpringDataEx3Bibliotheque.application;

import org.example.TPSpringDataEx3Bibliotheque.domaine.Book;

import java.util.List;

public interface BookService {
    void create(Book book);

    void update(Book book);

    void delete(Book book);

    Book findById(Long id);

    List<Book> findAll();

    List<Book> findByTitle(String title);
}
