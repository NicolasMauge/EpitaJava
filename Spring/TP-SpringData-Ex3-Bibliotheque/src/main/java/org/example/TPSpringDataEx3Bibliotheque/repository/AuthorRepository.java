package org.example.TPSpringDataEx3Bibliotheque.repository;

import org.example.TPSpringDataEx3Bibliotheque.domaine.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByName(String name);
}
