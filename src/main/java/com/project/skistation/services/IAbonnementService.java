package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.TypeAbonnement;

public interface IAbonnementService {

    Abonnement saveAbonnement(Abonnement abonnement);

    Optional<Abonnement> getAbonnementById(long numAbonnement);

    List<Abonnement> getAllAbonnements();

    void deleteAbonnementById(long id);
    
    List<Abonnement> getAbonnementByType(TypeAbonnement type);


}