package com.project.skistation.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Skieur;
import com.project.skistation.entities.TypeAbonnement;
import com.project.skistation.services.SkieurService;

import jakarta.websocket.server.PathParam;

// @AllArgsConstructor
@RestController
@RequestMapping("/skieurs")
public class SkieurController {
    @Autowired
    SkieurService skieurService;

    // SkieurController(SkieurService skieurService) {
    // this.skieurService = skieurService;
    // };

    @GetMapping("/all")
    List<Skieur> getAll() {
        return skieurService.retrieveAllSkieurs();
    }

    @GetMapping("/ski/{id}")
    Optional<Skieur> getOne(@PathVariable("id") Long id) {
        return skieurService.retrieveSkieur(id);
    }

    @GetMapping("/ski/")
    String hello() {
        return "hellooo" + "bye" + "blue" + "hell" + "another reload" + "awesome";
    }

    @PostMapping("/add")
    // public ResponseEntity<String> addOnSkieur(@RequestBody Skieur
    // requestBodySkieur) {
    public Skieur addSkieur(@RequestBody Skieur requestBodySkieur) {
        return skieurService.addSkieur(requestBodySkieur);
    }

    @PostMapping("/add-abonnement")
    public Skieur addSkieurAbonnement(@RequestBody Skieur skieur) {
        // System.out.println(skieur.toString()+"\n"+abonnement.toString());
        // System.out.println(request.toString());
        // return "";
        // Abonnement abonnement= new Abonnement(12, TypeAbonnement.ANNUEL);
        // skieur.setAbonnement(abonnement);

        // Skieur addedSkieur = skieurService.addSkieur(skieur);
        // return new ResponseEntity<>(addedSkieur, HttpStatus.CREATED);
        // System.out.println(skieur.getAbonnement());
        Skieur addedSkieur = skieurService.addSkieurWithAbonnement(skieur);
        return addedSkieur;
    }
    @PostMapping("/add-inscriptions")
    public Skieur addSkieurWithListInscriptions(@RequestBody Skieur skieur) {
        // System.out.println(skieur.toString()+"\n"+abonnement.toString());
        // System.out.println(request.toString());
        // return "";
        // Abonnement abonnement= new Abonnement(12, TypeAbonnement.ANNUEL);
        // skieur.setAbonnement(abonnement);

        // Skieur addedSkieur = skieurService.addSkieur(skieur);
        // return new ResponseEntity<>(addedSkieur, HttpStatus.CREATED);
        // System.out.println(skieur.getAbonnement());
        Skieur addedSkieur = skieurService.addSkieurWithAbonnement(skieur);
        return addedSkieur;
    }

}
