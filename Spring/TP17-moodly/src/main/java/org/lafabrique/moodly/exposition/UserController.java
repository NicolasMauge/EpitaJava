package org.lafabrique.moodly.exposition;

import org.lafabrique.moodly.application.UtilisateurService;
import org.lafabrique.moodly.application.UtilisateurServiceImpl;
import org.lafabrique.moodly.converter.convertActivities;
import org.lafabrique.moodly.converter.convertUtilisateur;
import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.domaine.Utilisateur;
import org.lafabrique.moodly.dto.ActivityDto;
import org.lafabrique.moodly.dto.UtilisateurDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping
    public void createUtilisateur(@RequestBody UtilisateurDto utilisateurDto) {
        Utilisateur utilisateur = convertUtilisateur.convertUtilisateurDtoToUtilisateurEntity(utilisateurDto);

        utilisateurService.createUser(utilisateur);
    }

    @GetMapping("/{id}")
    public UtilisateurDto findUtilisateurById(@PathVariable("id") Long id) throws EntityNotFoundException {
        Utilisateur utilisateur = utilisateurService.findUserById(id);

        if(utilisateur != null) {
            return convertUtilisateur.convertUtilisateurEntityToUtilisateurDto(utilisateur);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à un utilisateur existant");
        }
    }

    @PutMapping("/{id}")
    public void updateUtilisateur(@PathVariable("id") Long id, @RequestBody UtilisateurDto utilisateurDto) throws EntityNotFoundException {
        Utilisateur utilisateur = convertUtilisateur.convertUtilisateurDtoToUtilisateurEntity(utilisateurDto);

        if(utilisateur.getId() == id) {
            utilisateurService.updateUser(utilisateur);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à l'utilisateur modifié fourni");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable("id") Long id) throws EntityNotFoundException {
        Utilisateur utilisateur = utilisateurService.findUserById(id);

        if(utilisateur != null) {
            utilisateurService.deleteUser(utilisateur);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à un utilisateur existant");
        }
    }

    @GetMapping("/{id}/happy-activities")
    public List<ActivityDto> findHappyActivityFromUserById(@PathVariable("id") Long id) {
        List<Activity> activityList = utilisateurService.findHappyActivityForUserById(id);

        List<ActivityDto> activityDtoList = activityList.stream().map(a -> convertActivities.convertActivityEntityToActivityDto(a)).collect(Collectors.toList());

        return activityDtoList;
    }

    @GetMapping("/{id}/happy-activities")
    public List<ActivityDto> findSadActivityFromUserById(@PathVariable("id") Long id) {
        List<Activity> activityList = utilisateurService.findSadActivityForUserById(id);

        List<ActivityDto> activityDtoList = activityList.stream().map(a -> convertActivities.convertActivityEntityToActivityDto(a)).collect(Collectors.toList());

        return activityDtoList;
    }
}
