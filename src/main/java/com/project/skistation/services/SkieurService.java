package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Skieur;
import com.project.skistation.repositories.SkieurRepository;

@Service
public class SkieurService implements ISkieurService {
    @Autowired
    private SkieurRepository skieurRepository;

    // SkieurService(SkieurRepository skieurRepository) {
    // this.skieurRepository = skieurRepository;
    // }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        System.out.println(skieur.toString());
        return skieurRepository.save(skieur);
        // return null;
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSkieur'");
    }

    @Override
    public Optional<Skieur> retrieveSkieur(Long idSkieur) {
        return skieurRepository.findById(idSkieur);
    }

    @Override
    public void deleteSkieur(Long idSkieur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSkieur'");
    }

    @Override
    public Skieur addSkieurWithAbonnement(Skieur skieur,Abonnement abonnement) {
        skieur.setAbonnement(abonnement);
        return skieurRepository.save(skieur);

    }
    

}
