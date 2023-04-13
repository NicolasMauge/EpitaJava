package org.example.TPSpringDataEx3Bibliotheque.application;

import org.example.TPSpringDataEx3Bibliotheque.domaine.Author;
import org.example.TPSpringDataEx3Bibliotheque.repository.AuthorRepository;

import java.util.List;

public interface AuthorService {
    List<Author> findByName(String name);

    void create(Author author);
}
