package com.project.skistation.services;

import com.project.skistation.entities.Moniteur;
import com.project.skistation.repositories.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            // throw new IllegalArgumentException("Moniteur with numMoniteur " + updatedMoniteur.getNumMoniteur() + " not found");
        // }
    }

    public void deleteMoniteur(long numMoniteur) {
        Moniteur moniteurToDelete = moniteurRepository.findById(numMoniteur).get();

        // if (moniteurToDelete.isPresent()) {
            moniteurRepository.delete(moniteurToDelete);
        // } else {
        //     throw new IllegalArgumentException("Moniteur with numMoniteur " + numMoniteur + " not found");
        // }
    }
}