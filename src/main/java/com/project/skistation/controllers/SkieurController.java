package com.project.skistation.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.skistation.entities.Skieur;
import com.project.skistation.services.SkieurService;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSkieur(@PathVariable("id") Long id) {
        skieurService.deleteSkieur(id);
        return new ResponseEntity<>("Skieur with ID " + id + " has been deleted successfully.", HttpStatus.OK);
    }

    @PostMapping("/add")
    public Skieur addSkieur(@RequestBody Skieur requestBodySkieur) {
        return skieurService.addSkieur(requestBodySkieur);
    }

    @PostMapping("/add-abonnement")
    public Skieur addSkieurAbonnement(@RequestBody Skieur skieur) {
        Skieur addedSkieur = skieurService.addSkieurWithAbonnement(skieur);
        return addedSkieur;
    }

    @PostMapping("/add-inscriptions")
    public Skieur addSkieurWithListInscriptions(@RequestBody Skieur skieur) {
        Skieur addedSkieur = skieurService.addSkieurWithAbonnement(skieur);
        return addedSkieur;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skieur> updateSkieur(@PathVariable("id") Long id, @RequestBody Skieur skieur) {
        Optional<Skieur> skieurData = skieurService.retrieveSkieur(id);
        if (skieurData.isPresent()) {
            Skieur updatedSkieur = skieurData.get();
            // updatedSkieur.setNom(skieur.getNomSkieur());
            // updatedSkieur.setPrenom(skieur.getPrenomSkieur());
            // updatedSkieur.setEmail(skieur.gete());
            // updatedSkieur.setTelephone(skieur.getTelephone());
            // updatedSkieur.setAbonnement(skieur.getAbonnement());
            // updatedSkieur.setInscriptions(skieur.getInscriptions());
            return new ResponseEntity<>(skieurService.updateSkieur(updatedSkieur), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
