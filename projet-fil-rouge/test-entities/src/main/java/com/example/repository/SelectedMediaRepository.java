package com.example.repository;

import com.example.domaine.Media;
import com.example.domaine.SelectedMedia;
import com.example.domaine.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedMediaRepository extends JpaRepository<SelectedMedia, Long> {
    public SelectedMedia[] findByUtilisateur(Utilisateur utilisateur);
}
