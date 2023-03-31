package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Skieur;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur skieur);

    Skieur updateSkieur(Skieur skieur);

    Optional<Skieur> retrieveSkieur(Long idSkieur);

    void deleteSkieur(Long idSkieur);
    
    Skieur addSkieurWithAbonnement(Skieur skieur,Abonnement abonnement);

}
