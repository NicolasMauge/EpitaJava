package org.lafabrique.moodly.application;

import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.domaine.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    void createUser(Utilisateur utilisateur);

    Utilisateur findUserById(Long id);

    void updateUser(Utilisateur utilisateur);

    void deleteUser(Utilisateur utilisateur);

    List<Activity> findHappyActivityForUserById(Long id);

    List<Activity> findSadActivityForUserById(Long id);
}
