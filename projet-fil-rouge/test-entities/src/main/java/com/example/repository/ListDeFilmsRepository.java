package com.example.repository;

import com.example.domaine.ListDeFilms;
import com.example.domaine.SelectedMedia;
import com.example.domaine.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListDeFilmsRepository extends JpaRepository<ListDeFilms, Long> {
    ListDeFilms[] findByUtilisateur(Utilisateur utilisateur);

}
