package org.example.TPSpringDataEx3Bibliotheque.application;

import org.example.TPSpringDataEx3Bibliotheque.domaine.Author;
import org.example.TPSpringDataEx3Bibliotheque.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> findByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public void create(Author author) {
        authorRepository.save(author);
    }
}
