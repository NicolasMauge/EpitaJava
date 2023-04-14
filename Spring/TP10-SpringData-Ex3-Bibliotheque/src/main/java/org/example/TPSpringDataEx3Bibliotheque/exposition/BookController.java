package org.example.TPSpringDataEx3Bibliotheque.exposition;

import org.example.TPSpringDataEx3Bibliotheque.application.AuthorService;
import org.example.TPSpringDataEx3Bibliotheque.DTO.BookDTO;
import org.example.TPSpringDataEx3Bibliotheque.application.BookService;
import org.example.TPSpringDataEx3Bibliotheque.domaine.Author;
import org.example.TPSpringDataEx3Bibliotheque.domaine.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    AuthorService service;

    @PostMapping("/create")
    public void create(@RequestBody Book book) {
        bookService.create(book);
    }

    @PostMapping("/update")
    public void update(@RequestBody Book book) {
        bookService.update(book);
    }

    // méthode mal intégrée => il faudrait créer une classe de conversion dans exposition
    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);

        return new BookDTO(book.getTitle(), book.getDescription());
    }

    // il faudrait faire la même chose sur les autres classes => il faut exposer un DTO
    @GetMapping("/title/{title}")
    public List<Book> findByTitle(@PathVariable("title") String title) {
        return bookService.findByTitle(title);
    }

    @PostMapping("/authorcreate")
    public void create(@RequestBody Author author) {
        service.create(author);
    }

    @GetMapping("/name/{name}")
    public List<Author> findByName(@PathVariable("name") String name) {
        return service.findByName(name);
    }
}
