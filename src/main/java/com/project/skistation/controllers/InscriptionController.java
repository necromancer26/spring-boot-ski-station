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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.skistation.entities.Inscription;
import com.project.skistation.services.IInscriptionService;

@RestController
@RequestMapping("/api/v1/inscriptions")
public class InscriptionController {

    @Autowired
    private IInscriptionService inscriptionService;

    @GetMapping("/")
    public ResponseEntity<List<Inscription>> getAllInscriptions() {
        List<Inscription> inscriptions = inscriptionService.getAllInscriptions();
        return new ResponseEntity<>(inscriptions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Inscription>> getInscriptionById(@PathVariable("id") long id) {
        Optional<Inscription> inscription = inscriptionService.getInscriptionById(id);
        if (inscription.isPresent()) {
            return new ResponseEntity<>(inscription, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Inscription> saveInscription(@RequestBody Inscription inscription) {
        Inscription savedInscription = inscriptionService.saveInscription(inscription);
        return new ResponseEntity<>(savedInscription, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInscriptionById(@PathVariable("id") long id) {
        inscriptionService.deleteInscriptionById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
