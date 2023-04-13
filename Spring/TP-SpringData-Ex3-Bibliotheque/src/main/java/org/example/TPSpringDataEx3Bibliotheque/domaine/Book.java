package org.example.TPSpringDataEx3Bibliotheque.domaine;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate publicationDate;
    @ManyToMany
    private Set<Author> authors;

    public Book(String title, String description, LocalDate publicationDate, Set<Author> authors) {
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.authors = authors;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
