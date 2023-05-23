package org.lafabrique.moodly.converter;

import org.lafabrique.moodly.domaine.Utilisateur;
import org.lafabrique.moodly.dto.UtilisateurDto;

public class convertUtilisateur {
    public static Utilisateur convertUtilisateurDtoToUtilisateurEntity(UtilisateurDto utilisateurDto) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setName(utilisateurDto.getName());

        return utilisateur;
    }

    public static UtilisateurDto convertUtilisateurEntityToUtilisateurDto(Utilisateur utilisateur) {
        UtilisateurDto utilisateurDto = new UtilisateurDto();
        utilisateurDto.setEmail(utilisateur.getEmail());
        utilisateurDto.setName(utilisateur.getName());
        utilisateurDto.setId(utilisateur.getId());

        return utilisateurDto;
    }
}
