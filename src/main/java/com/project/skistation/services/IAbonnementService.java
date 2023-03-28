package com.project.skistation.services;

import java.util.List;

import com.project.skistation.entities.Abonnement;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnement();

    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement(Abonnement abonnement);

    Abonnement retrieveAbonnement(Long idAbonnement);

    void deleteAbonnement(Long idAbonnement);
}
