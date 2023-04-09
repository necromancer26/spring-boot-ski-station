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

import com.project.skistation.entities.Piste;
import com.project.skistation.services.IPisteService;

@RestController
@RequestMapping("/api")
public class PisteController {

    @Autowired
    private IPisteService pisteService;

    @PostMapping("/pistes")
    public ResponseEntity<Piste> createPiste(@RequestBody Piste piste) {
        Piste savedPiste = pisteService.savePiste(piste);
        return new ResponseEntity<>(savedPiste, HttpStatus.CREATED);
    }

    @GetMapping("/pistes/{id}")
    public ResponseEntity<Piste> getPisteById(@PathVariable long id) {
        Optional<Piste> optionalPiste = pisteService.getPisteById(id);
        return optionalPiste.map(piste -> new ResponseEntity<>(piste, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/pistes")
    public List<Piste> getAllPistes() {
        return pisteService.getAllPistes();
    }

    @DeleteMapping("/pistes/{id}")
    public ResponseEntity<HttpStatus> deletePisteById(@PathVariable long id) {
        try {
            pisteService.deletePisteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
