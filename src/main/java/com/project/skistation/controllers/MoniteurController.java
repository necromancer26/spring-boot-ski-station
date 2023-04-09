package com.project.skistation.controllers;

import com.project.skistation.entities.Moniteur;
import com.project.skistation.services.MoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moniteurs")
public class MoniteurController {

    private final MoniteurService moniteurService;

    @Autowired
    public MoniteurController(MoniteurService moniteurService) {
        this.moniteurService = moniteurService;
    }

    @GetMapping
    public List<Moniteur> getAllMoniteurs() {
        return moniteurService.getAllMoniteurs();
    }

    @GetMapping("/{numMoniteur}")
    public Moniteur getMoniteurByNumMoniteur(@PathVariable long numMoniteur) {
        return moniteurService.getMoniteurById(numMoniteur);
    }

    @PostMapping
    public ResponseEntity<Moniteur> addMoniteur(@RequestBody Moniteur moniteur) {
        Moniteur addedMoniteur = moniteurService.createMoniteur(moniteur);
        return new ResponseEntity<>(addedMoniteur, HttpStatus.CREATED);
    }

    @PutMapping("/{numMoniteur}")
    public Moniteur updateMoniteur(@PathVariable long numMoniteur, @RequestBody Moniteur moniteur) {
        moniteur.setNumMoniteur(numMoniteur);
        return moniteurService.updateMoniteur(moniteur);
    }
    

    @DeleteMapping("/{numMoniteur}")
    public ResponseEntity<Void> deleteMoniteur(@PathVariable long numMoniteur) {
        moniteurService.deleteMoniteur(numMoniteur);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}