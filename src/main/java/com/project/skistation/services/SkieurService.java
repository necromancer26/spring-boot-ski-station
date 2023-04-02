package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Skieur;
import com.project.skistation.repositories.AbonnementRepository;
import com.project.skistation.repositories.InscriptionRepository;
import com.project.skistation.repositories.SkieurRepository;

@Service
public class SkieurService implements ISkieurService {
    @Autowired
    private SkieurRepository skieurRepository;
    @Autowired
    private AbonnementRepository abonnementRepository;
    @Autowired
    private InscriptionRepository inscriptionRepository;

    // SkieurService(SkieurRepository skieurRepository) {
    // this.skieurRepository = skieurRepository;
    // }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
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
    public Skieur addSkieurWithAbonnement(Skieur skieur) {
        abonnementRepository.save(skieur.getAbonnement());
        return skieurRepository.save(skieur);

    }

    public Skieur addSkieurWithListInscriptions(Skieur skieur) {
        // inscriptionRepository.save(skieur.getInscriptions());
        // inscriptionRepository.save(skieur.getInscriptions());
        inscriptionRepository.saveAll(skieur.getInscriptions());
        return skieurRepository.save(skieur);
    }
    

}
