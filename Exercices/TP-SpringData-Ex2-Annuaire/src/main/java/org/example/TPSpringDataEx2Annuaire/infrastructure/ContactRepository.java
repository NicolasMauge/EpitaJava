package org.example.TPSpringDataEx2Annuaire.infrastructure;

import org.example.TPSpringDataEx2Annuaire.domaine.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByFirstName(String firstName);

    List<Contact> findByLastName(String lastName);

    List<Contact> findByPhoneNumber(String phoneNumber);
}
