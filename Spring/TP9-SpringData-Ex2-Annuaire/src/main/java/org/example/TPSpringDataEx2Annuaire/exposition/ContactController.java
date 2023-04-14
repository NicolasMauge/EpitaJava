package org.example.TPSpringDataEx2Annuaire.exposition;

import org.example.TPSpringDataEx2Annuaire.application.ContactService;
import org.example.TPSpringDataEx2Annuaire.domaine.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {
    @Autowired
    ContactService service;

    @PostMapping("/create")
    public void create(@RequestBody Contact contact) {
        service.create(contact);
    }

    @PostMapping("/update")
    public void update(@RequestBody Contact contact) {
        service.update(contact);
    }

    @GetMapping("/{id}")
    public Contact findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Contact> findAll() {
        return service.findAll();
    }

    @GetMapping("/surname/{firstName}")
    public List<Contact> findByFirstName(@PathVariable("firstName") String firstName) {
        return service.findByFirstName(firstName);
    }

    @GetMapping("/lastname/{lastName}")
    public List<Contact> findByLastName(@PathVariable("lastName") String lastName) {
        return service.findByLastName(lastName);
    }

    @PostMapping("/name")
    public List<Contact> findByLastNameAndFirstName(@RequestBody Contact contact) {
        return service.findByLastNameAndFirstName(contact);
    }

    @GetMapping("/phonenumber/{phoneNumber}")
    public List<Contact> findByPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
        return service.findByPhoneNumber(phoneNumber);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        Contact contact = findById(id);
        service.delete(contact);
    }
}
