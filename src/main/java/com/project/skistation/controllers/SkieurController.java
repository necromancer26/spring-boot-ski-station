package com.project.skistation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.skistation.entities.Skieur;
import com.project.skistation.services.SkieurService;

import jakarta.websocket.server.PathParam;

// @AllArgsConstructor
@RestController
@RequestMapping("/skieurs")
public class SkieurController {
    @Autowired
    SkieurService skieurService;

    SkieurController(SkieurService skieurService) {
        this.skieurService = skieurService;
    };

    @GetMapping("/all")
    List<Skieur> all() {
        return skieurService.retrieveAllSkieurs();
    }

    @GetMapping("/ski/{id}")
    Optional<Skieur> one(@PathVariable("id") Long id) {
        // return id+"id";
        return skieurService.retrieveSkieur(id);
    }
    // Optional<Skieur> 

    // String hello(){
    // return "hello";
    // }

}
