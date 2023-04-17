package com.project.skistation.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Couleur;
import com.project.skistation.entities.Cour;
import com.project.skistation.entities.Inscription;
import com.project.skistation.entities.Piste;
import com.project.skistation.entities.Skieur;
import com.project.skistation.entities.TypeAbonnement;
import com.project.skistation.repositories.AbonnementRepository;
import com.project.skistation.repositories.CourRepository;
import com.project.skistation.repositories.InscriptionRepository;
import com.project.skistation.repositories.PisteRepository;
import com.project.skistation.repositories.SkieurRepository;

@Service
public class SkieurService implements ISkieurService {
    @Autowired
    private SkieurRepository skieurRepository;
    @Autowired
    private CourRepository courRepository;
    @Autowired
    private PisteRepository pisteRepository;
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

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) throws NotFoundException {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElseThrow(() -> new NotFoundException());
        Piste piste = pisteRepository.findById(numPiste)
                .orElseThrow(() -> new NotFoundException());
        skieur.getPistes().add(piste);
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur addSkieurAndAssignToCours(Skieur skieur, Long numCours) {
        Cour cour = courRepository.findById(numCours).get();
        skieur.getAbonnement();
        Inscription inscription = new Inscription();
        inscription.setCour(cour);
        skieur.getInscriptions().add(inscription);
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retrieveSkieursByAbonnementType(TypeAbonnement typeAbonnement) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retrieveSkieursByAbonnementType'");
    }

    @Override
    public HashMap<Couleur, Integer> nombreSkieursParCouleurPiste() {
        HashMap<Couleur, Integer> nombreSkieursParCouleurPiste = new HashMap<>();
        List<Skieur> skieurs = skieurRepository.findAll();

        // List couleurs= (List) Couleur.values();
        Arrays.asList(Couleur.values())
                .forEach(couleur -> {             
                    // int nbSkieur= skieurs.stream().filter(skieur->{ skieur.getPistes().stream().anyMatch(t -> t.getCouleur().compareTo(couleur)) }).count();
                
                    nombreSkieursParCouleurPiste.put(couleur, 2);});

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombreSkieursParCouleurPiste'");
    }

}
