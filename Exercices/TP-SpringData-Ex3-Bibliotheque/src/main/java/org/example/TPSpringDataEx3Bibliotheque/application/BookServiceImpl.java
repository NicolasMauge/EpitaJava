package org.example.TPSpringDataEx3Bibliotheque.application;

import org.example.TPSpringDataEx3Bibliotheque.domaine.Book;
import org.example.TPSpringDataEx3Bibliotheque.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public Book findById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return bookRepository.findById(id).get();
        }
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
