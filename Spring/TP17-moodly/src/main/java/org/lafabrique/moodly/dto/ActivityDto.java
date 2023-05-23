package org.lafabrique.moodly.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.lafabrique.moodly.domaine.Utilisateur;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class ActivityDto {
    private Long id;
    private UtilisateurDto userDto;
    private String name;
    private int duration;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public ActivityDto(Long id, UtilisateurDto userDto, String name, int duration, LocalDate date) {
        this.id = id;
        this.userDto = userDto;
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    public ActivityDto() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
