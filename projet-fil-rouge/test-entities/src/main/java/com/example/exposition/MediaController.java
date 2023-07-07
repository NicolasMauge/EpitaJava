package com.example.exposition;

import com.example.domaine.*;
import com.example.repository.ListDeFilmsRepository;
import com.example.repository.MediaRepository;
import com.example.repository.SelectedMediaRepository;
import com.example.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MediaController {
    @Autowired
    MediaRepository mediaRepository;
    @Autowired
    SelectedMediaRepository selectedMediaRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    ListDeFilmsRepository listDeFilmsRepository;

    public void insertData() {


        Movie testMovie = new Movie();
        testMovie.setValue("test");
        this.mediaRepository.save(testMovie);

        TVShow tvShow = new TVShow();
        tvShow.setValue("tvshow");
        this.mediaRepository.save(tvShow);




        SelectedMedia selectedMedia = new SelectedMedia();

        Utilisateur utilisateur = new Utilisateur();
        utilisateurRepository.save(utilisateur);

        selectedMedia.setUtilisateur(utilisateur);
        selectedMedia.setMedia(testMovie);

        MyTag myTag = new MyTag();
        myTag.setName("tag1");
        MyTag myTag2 = new MyTag();
        myTag2.setName("tag2");

        List<MyTag> tagList = new ArrayList<>();
        tagList.add(myTag);
        tagList.add(myTag2);

        selectedMedia.setTagList(tagList);

        selectedMediaRepository.save(selectedMedia);




        SelectedMedia selectedMedia2 = new SelectedMedia();

        selectedMedia2.setUtilisateur(utilisateur);
        selectedMedia2.setMedia(tvShow);
        selectedMediaRepository.save(selectedMedia2);


        ListDeFilms listDeFilms = new ListDeFilms();
        listDeFilms.setName("Liste de films");
        listDeFilms.setUtilisateur(utilisateur);
        listDeFilmsRepository.save(listDeFilms);


    }

    @GetMapping
    public void testInsertion(){
        insertData();
    }

    @GetMapping("/{user}")
    public SelectedMedia[] getAll(@PathVariable("user") Long id) {

        Utilisateur utilisateur = utilisateurRepository.findById(id).get();

        System.out.println(utilisateur);


        System.out.println(selectedMediaRepository.findByUtilisateur(utilisateur));

        return selectedMediaRepository.findByUtilisateur(utilisateur);
    }
/*
    @GetMapping("/list/{utilisateur}")
    public SelectedMedia[] getList(@PathVariable("utilisateur") Long id) {
        Utilisateur utilisateur = utilisateurRepository.findById(id).get();
        System.out.println(utilisateur);

        ListDeFilms[] listDeFilms = listDeFilmsRepository.findByUtilisateur(utilisateur);
/*
        Utilisateur utilisateur = utilisateurRepository.findById(listDeFilms.getUtilisateur());
        System.out.println(utilisateur);


    }*/
}
