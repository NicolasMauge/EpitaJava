package org.lafabrique.moodly.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.lafabrique.moodly.domaine.Utilisateur;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class MoodEntryDto {
    private Long id;

    private UtilisateurDto userDto;

    private Boolean mood;

    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public MoodEntryDto(Long id, UtilisateurDto userDto, Boolean mood, String description, LocalDate date) {
        this.id = id;
        this.userDto = userDto;
        this.mood = mood;
        this.description = description;
        this.date = date;
    }

    public MoodEntryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UtilisateurDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UtilisateurDto userDto) {
        this.userDto = userDto;
    }

    public Boolean getMood() {
        return mood;
    }

    public void setMood(Boolean mood) {
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
