package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Skieur;
import com.project.skistation.entities.TypeAbonnement;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur skieur);

    Skieur updateSkieur(Skieur skieur);

    Optional<Skieur> retrieveSkieur(Long idSkieur);

    void deleteSkieur(Long idSkieur);
    
    Skieur addSkieurWithAbonnement(Skieur skieur);
       
    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) throws NotFoundException;
    

    Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours);
    
    
    List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement);
    

}
