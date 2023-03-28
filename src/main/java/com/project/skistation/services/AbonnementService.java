package com.project.skistation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.repositories.AbonnementRepository;

@Service
@Component
public class AbonnementService implements IAbonnementService{
    @Autowired
    private AbonnementRepository abonnementRepository;

    public AbonnementService (AbonnementRepository abonnementRepository){

    }

    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAbonnement'");
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAbonnement'");
    }

    @Override
    public Abonnement retrieveAbonnement(Long idAbonnement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retrieveAbonnement'");
    }

    @Override
    public void deleteAbonnement(Long idAbonnement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAbonnement'");
    }
    
}
