package org.example.TPSpringDataEx2Annuaire.application;

import org.example.TPSpringDataEx2Annuaire.domaine.Contact;

import java.util.List;


public interface ContactService {
    void create(Contact contact);

    void update(Contact contact);

    Contact findById(Long id);

    List<Contact> findAll();

    List<Contact> findByFirstName(String firstName);

    List<Contact> findByLastName(String lastName);

    List<Contact> findByPhoneNumber(String phoneNumber);

    void delete(Contact contact);

    List<Contact> findByLastNameAndFirstName(Contact contact);
}
