package org.example.TPSpringDataEx3Bibliotheque.application;

public class BookDTO {
    private Long Id;
    private String titre;
    private String description;

    public BookDTO(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public BookDTO() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
