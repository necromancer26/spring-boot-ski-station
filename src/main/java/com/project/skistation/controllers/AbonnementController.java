package com.project.skistation.controllers;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.services.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/abonnements")
public class AbonnementController {

    @Autowired
    private AbonnementService abonnementService;

    @GetMapping("/{numAbonnement}")
    public ResponseEntity<Abonnement> getAbonnementById(@PathVariable long numAbonnement) {
        Optional<Abonnement> abonnement = abonnementService.getAbonnementById(numAbonnement);
        if (abonnement.isPresent()) {
            return ResponseEntity.ok(abonnement.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Abonnement> getAllAbonnements() {
        return abonnementService.getAllAbonnements();
    }

    @PostMapping
    public ResponseEntity<Abonnement> saveAbonnement(@RequestBody Abonnement abonnement) {
        Abonnement savedAbonnement = abonnementService.saveAbonnement(abonnement);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAbonnement);
    }

    @PutMapping("/{numAbonnement}")
    public ResponseEntity<Abonnement> updateAbonnement(@PathVariable long numAbonnement, @RequestBody Abonnement abonnement) {
        Optional<Abonnement> existingAbonnement = abonnementService.getAbonnementById(numAbonnement);
        if (existingAbonnement.isPresent()) {
            abonnement.setNumAbonnement(numAbonnement);
            Abonnement updatedAbonnement = abonnementService.saveAbonnement(abonnement);
            return ResponseEntity.ok(updatedAbonnement);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

    @DeleteMapping("/{numAbonnement}")
    public ResponseEntity<Void> deleteAbonnementById(@PathVariable long numAbonnement) {
        Optional<Abonnement> abonnement = abonnementService.getAbonnementById(numAbonnement);
        if (abonnement.isPresent()) {
            abonnementService.deleteAbonnementById(numAbonnement);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
