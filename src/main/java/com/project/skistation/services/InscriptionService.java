package com.project.skistation.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Couleur;
import com.project.skistation.entities.Cour;
import com.project.skistation.entities.Inscription;
import com.project.skistation.entities.Skieur;
import com.project.skistation.repositories.CourRepository;
import com.project.skistation.repositories.InscriptionRepository;
import com.project.skistation.repositories.SkieurRepository;

@Service
@Component
public class InscriptionService implements IInscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Autowired
    private SkieurRepository skieurRepository;
    @Autowired
    private CourRepository courRepository;

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

    @Override
    public Inscription addInscriptionAndAssignToSkieurAndCours(Inscription inscription, Long numSkieur, Long numCours) {
        try {
            
            Skieur skieur= skieurRepository.findById(numSkieur).get();
            Cour cour= courRepository.findById(numCours).get();
            inscription.setCour(cour);
            inscription.setSkieur(skieur);
            return inscriptionRepository.save(inscription);

        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Unimplemented method 'addInscriptionAndAssignToSkieurAndCours'");
            
        }
        // TODO Auto-generated method stub
    }

}
