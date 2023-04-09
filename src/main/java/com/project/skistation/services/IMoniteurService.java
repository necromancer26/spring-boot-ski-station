package com.project.skistation.services;

import java.util.List;

import com.project.skistation.entities.Moniteur;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur moniteur);

    Moniteur updateMoniteur(Moniteur moniteur);

    Moniteur retrieveMoniteur(Long idMoniteur);

    void deleteMoniteur(Long idMoniteur);
    
    Moniteur addMoniteurAndAssignToCours(Moniteur moniteur);

}
