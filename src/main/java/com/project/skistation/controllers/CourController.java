package com.project.skistation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.skistation.entities.Cour;
import com.project.skistation.services.CourService;

@RestController
@RequestMapping("/api")
public class CourController {
    @Autowired
    private CourService courService;

    @GetMapping("/cours")
    public List<Cour> retrieveAllCours() {
        return courService.retrieveAllCours();
    }

    @GetMapping("/cours/{id}")
    public ResponseEntity<Cour> retrieveCour(@PathVariable long id) {
        Optional<Cour> cour = courService.retrieveCour(id);
        if (cour.isPresent()) {
            return ResponseEntity.ok(cour.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/cours")
    public ResponseEntity<Cour> addCour(@RequestBody Cour cour) {
        Cour savedCour = courService.addCour(cour);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCour);
    }

    @PutMapping("/cours/{id}")
    public ResponseEntity<Cour> updateCour(@PathVariable long id, @RequestBody Cour cour) {
        Optional<Cour> existingCour = courService.retrieveCour(id);
        if (existingCour.isPresent()) {
            cour.setNumCours(id);
            Cour updatedCour = courService.updateCour(cour);
            return ResponseEntity.ok(updatedCour);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/cours/{id}")
    public ResponseEntity<Void> deleteCour(@PathVariable long id) {
        courService.deleteCour(id);
        return ResponseEntity.noContent().build();
    }
}