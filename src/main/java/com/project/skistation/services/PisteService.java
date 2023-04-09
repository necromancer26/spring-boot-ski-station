package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Piste;
import com.project.skistation.repositories.PisteRepository;

@Service
@Component
public class PisteService implements IPisteService {
    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public Piste savePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Optional<Piste> getPisteById(long numPiste) {
        return pisteRepository.findById(numPiste);
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public void deletePisteById(long id) {
        pisteRepository.deleteById(id);
    }

    @Override
    public Piste updatePiste(Piste modifiedPiste) {
        Optional<Piste> optionalPiste = pisteRepository.findById(modifiedPiste.getNumPiste());
        if (optionalPiste.isPresent()) {
            Piste existingPiste = optionalPiste.get();
            existingPiste.setNomPiste(modifiedPiste.getNomPiste());
            existingPiste.setCouleur(modifiedPiste.getCouleur());
            existingPiste.setLongeur(modifiedPiste.getLongeur());
            existingPiste.setPente(modifiedPiste.getPente());
            existingPiste.setSkieurs(modifiedPiste.getSkieurs());
            existingPiste.setAbonnement(modifiedPiste.getAbonnement());
            return pisteRepository.save(existingPiste);
        }
        return null; // or throw an exception if desired
    }

}
