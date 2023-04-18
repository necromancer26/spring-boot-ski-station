package com.project.skistation.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Skieur;
import com.project.skistation.entities.TypeAbonnement;
import com.project.skistation.repositories.AbonnementRepository;
import com.project.skistation.repositories.SkieurRepository;

import jakarta.persistence.Temporal;

@Service
@Component
public class AbonnementService implements IAbonnementService {
    @Autowired
    private AbonnementRepository abonnementRepository;
    @Autowired
    private SkieurRepository skieurRepository;

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

    // @Scheduled(cron = "* 1 * * * *")
    // @Async
    void retrieveSubscriptions() {
        List<Abonnement> abonnements = abonnementRepository.findAll();
        LocalDate now = LocalDate.now();
        // Date date = Date.from(LocalDateTime.now().toInstant());
        // System.out.println(now);

        abonnements.forEach(abonnement -> {
            Date finAbonnement = abonnement.getDateFin();
            LocalDate abonnementEnd = finAbonnement.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            long diff = ChronoUnit.DAYS.between(now,abonnementEnd);
            System.out.println("the difference is"+diff+"reniew");
            if (diff<7) {
                System.out.println("reniew subscription");
                System.out.println(abonnement.getNumAbonnement());
                // ToDO get skieur by abonnement and show details

            }
            // ChronoUnit.DAYS.between(now, finAbonnement);
        });

        // Skieur skieur = skieurRepository.findById((long) 14).get();

        // System.out.println("inside services");
        // System.out.println(skieurs.toString());
        // skieurs.forEach(skieur -> System.out.println(skieur.toString()));
    }

}
