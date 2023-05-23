package org.lafabrique.moodly.application;

import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.domaine.MoodEntry;
import org.lafabrique.moodly.domaine.Utilisateur;
import org.lafabrique.moodly.infra.ActivityRepo;
import org.lafabrique.moodly.infra.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UtilisateurRepo utilisateurRepo;

    @Autowired
    ActivityRepo activityRepo;

    @Override
    public void createUser(Utilisateur utilisateur) {
        utilisateurRepo.save(utilisateur);
    }

    @Override
    public Utilisateur findUserById(Long id) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepo.findById(id);
        if (!optionalUtilisateur.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return optionalUtilisateur.get();
        }
    }

    @Override
    public void updateUser(Utilisateur utilisateur) {
        utilisateurRepo.save(utilisateur);
    }

    @Override
    public void deleteUser(Utilisateur utilisateur) {
        utilisateurRepo.delete(utilisateur);
    }

    @Override
    public List<Activity> findHappyActivityForUserById(Long id) {
        return activityRepo.findHappyActivityForUserById(id);
    }

    @Override
    public List<Activity> findSadActivityForUserById(Long id) {
        return activityRepo.findSadActivityForUserById(id);
    }
}
