package com.project.skistation.services;

import com.project.skistation.entities.Moniteur;
import com.project.skistation.repositories.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.List;
import java.util.Optional;

@Service
public class MoniteurService {

    @Autowired
    private MoniteurRepository moniteurRepository;

    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    public Moniteur getMoniteurById(long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).get();
    }

    public Moniteur createMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    public Moniteur updateMoniteur(Moniteur updatedMoniteur) {
        Moniteur existingMoniteur = moniteurRepository.findById(updatedMoniteur.getNumMoniteur()).get();

        // if (existingMoniteur.isPresent()) {
        return moniteurRepository.save(updatedMoniteur);
        // } else {
        // throw new IllegalArgumentException("Moniteur with numMoniteur " +
        // updatedMoniteur.getNumMoniteur() + " not found");
        // }
    }

    public void deleteMoniteur(long numMoniteur) {
        Moniteur moniteurToDelete = moniteurRepository.findById(numMoniteur).get();

        // if (moniteurToDelete.isPresent()) {
        moniteurRepository.delete(moniteurToDelete);
        // } else {
        // throw new IllegalArgumentException("Moniteur with numMoniteur " + numMoniteur
        // + " not found");
        // }
    }

    public Moniteur besMoniteur() throws Exception {
        try {
            List<Moniteur> moniteurs = moniteurRepository.findAll();
            // Moniteur moniteur= moniteurs.stream().max(moniteur -> {
            // moniteur.getCours().stream().count();
            // });
            // moniteurs.stream().max(moniteur->moniteur.getCours().stream().count())
            Moniteur moniteur = moniteurs.stream().reduce(moniteurs.get(0), (m1, m2) -> {
                return m1.getCours().stream().count() > m2.getCours().stream().count() ? m1 : m2;
            });
            return moniteur;

        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception();
        }
    }
}