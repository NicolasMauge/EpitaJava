package org.example.TPSpringDataEx2Annuaire.application;

import org.example.TPSpringDataEx2Annuaire.domaine.Contact;
import org.example.TPSpringDataEx2Annuaire.infrastructure.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository repository;

    @Override
    public void create(Contact contact) {
        repository.save(contact);
    }

    @Override
    public void update(Contact contact) {
        repository.save(contact);
    }

    @Override
    public Contact findById(Long id) {
        Optional<Contact> optionalTask = repository.findById(id);
        if (!optionalTask.isPresent()) {
            throw new EntityNotFoundException();
        }
        return repository.findById(id).get();
    }

    @Override
    public List<Contact> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Contact> findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    public List<Contact> findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public List<Contact> findByPhoneNumber(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public void delete(Contact contact) {
        repository.delete(contact);
    }
}
