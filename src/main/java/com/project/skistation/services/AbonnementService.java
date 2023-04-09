package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.TypeAbonnement;
import com.project.skistation.repositories.AbonnementRepository;

@Service
@Component
public class AbonnementService implements IAbonnementService {
    @Autowired
    private AbonnementRepository abonnementRepository;

    @Override
    public Abonnement saveAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    public Optional<Abonnement> getAbonnementById(long numAbonnement) {
        return abonnementRepository.findById(numAbonnement);
    }

    @Override
    public List<Abonnement> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public void deleteAbonnementById(long id) {
        abonnementRepository.deleteById(id);
    }

    @Override
    public List<Abonnement> getAbonnementByType(TypeAbonnement type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbonnementByType'");
    }

}
