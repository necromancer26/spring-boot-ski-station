package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Inscription;
import com.project.skistation.repositories.InscriptionRepository;

@Service
@Component
public class InscriptionService implements IInscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Override
    public Inscription saveInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Optional<Inscription> getInscriptionById(long numInscription) {
        return inscriptionRepository.findById(numInscription);
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public void deleteInscriptionById(long id) {
        inscriptionRepository.deleteById(id);
    }
}
