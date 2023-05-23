package org.lafabrique.moodly.converter;

import org.lafabrique.moodly.domaine.MoodEntry;
import org.lafabrique.moodly.domaine.Utilisateur;
import org.lafabrique.moodly.dto.MoodEntryDto;
import org.lafabrique.moodly.dto.UtilisateurDto;

public class convertMoodEntry {
    public static MoodEntryDto convertMoodEntryEntityToMoodEntryDto(MoodEntry moodEntry) {
        MoodEntryDto moodEntryDto = new MoodEntryDto();
        moodEntryDto.setDate(moodEntry.getDate());
        moodEntryDto.setDescription(moodEntry.getDescription());
        moodEntryDto.setMood(moodEntry.getMood());

        UtilisateurDto utilisateurDto = convertUtilisateur.convertUtilisateurEntityToUtilisateurDto(moodEntry.getUser());

        moodEntryDto.setUserDto(utilisateurDto);

        return moodEntryDto;
    }

    public static MoodEntry convertMoodEntryDtoToMoodEntryEntity(MoodEntryDto moodEntryDto) {
        MoodEntry moodEntry = new MoodEntry();
        moodEntry.setDate(moodEntryDto.getDate());
        moodEntry.setDescription(moodEntryDto.getDescription());
        moodEntry.setMood(moodEntryDto.getMood());

        Utilisateur utilisateur = convertUtilisateur.convertUtilisateurDtoToUtilisateurEntity(moodEntryDto.getUserDto());

        moodEntry.setUser(utilisateur);

        return moodEntry;
    }
}
