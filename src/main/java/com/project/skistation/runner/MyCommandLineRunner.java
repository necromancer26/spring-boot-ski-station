package com.project.skistation.runner;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.random.RandomGeneratorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.arakelian.faker.service.RandomPerson;
import com.project.skistation.entities.Abonnement;
import com.project.skistation.entities.Couleur;
import com.project.skistation.entities.Piste;
import com.project.skistation.entities.Skieur;
import com.project.skistation.entities.TypeAbonnement;
import com.project.skistation.repositories.AbonnementRepository;
import com.project.skistation.repositories.PisteRepository;
import com.project.skistation.services.AbonnementService;
import com.project.skistation.services.SkieurService;

@SpringBootApplication
@ComponentScan(basePackages = "com.project.skistation")
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private AbonnementRepository abonnementRepository;
    @Autowired
    private PisteRepository pisteRepository;
    @Autowired
    private AbonnementService abonnementService;
    @Autowired
    private SkieurService skieurService;
    @Override
    public void run(String... args) throws Exception {
        // create a new Abonnement
        System.out.println("hello inside cli");

        // Abonnement abonnement = new Abonnement();
        // abonnement.setNumAbonnement(1L);
        // abonnement.setDateDebut(new Date());
        // abonnement.setDateFin(new Date());
        // abonnement.setPrixAbonnement(100.0f);
        // abonnement.setTypeAbonnement(TypeAbonnement.ANNUEL);
        // abonnementRepository.save(abonnement);
        // Piste piste=new Piste("Les Crêtes", Couleur.VERT, 5, 2);
        // pisteRepository.save(piste);


        System.out.println("hello");
        // abonnementRepository.findAll().forEach(abonnement->{abonnement.toString();});
    }

}