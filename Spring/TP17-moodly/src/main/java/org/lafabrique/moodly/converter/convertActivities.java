package org.lafabrique.moodly.converter;

import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.domaine.Utilisateur;
import org.lafabrique.moodly.dto.ActivityDto;
import org.lafabrique.moodly.dto.UtilisateurDto;

public class convertActivities {
    public static Activity convertActivityDtoToActivityEntity(ActivityDto activityDto) {
        Activity activity = new Activity();

        activity.setDate(activityDto.getDate());
        activity.setDuration(activityDto.getDuration());
        activity.setName(activityDto.getName());

        Utilisateur utilisateur = convertUtilisateur.convertUtilisateurDtoToUtilisateurEntity(activityDto.getUserDto());

        activity.setUser(utilisateur);

        return activity;
    }

    public static ActivityDto convertActivityEntityToActivityDto(Activity activity) {
        ActivityDto activityDto = new ActivityDto();

        activityDto.setDate(activity.getDate());
        activityDto.setDuration(activity.getDuration());
        activityDto.setName(activity.getName());
        activityDto.setId(activity.getId());

        UtilisateurDto utilisateurDto = convertUtilisateur.convertUtilisateurEntityToUtilisateurDto(activity.getUser());

        activityDto.setUserDto(utilisateurDto);

        return activityDto;
    }
}
