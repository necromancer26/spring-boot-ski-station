package com.project.skistation.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.project.skistation.repositories.AbonnementRepository;
import com.project.skistation.repositories.PisteRepository;
import com.project.skistation.services.IAbonnementService;
import com.project.skistation.services.SkieurService;

@SpringBootApplication
@ComponentScan(basePackages = "com.project.skistation")
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private AbonnementRepository abonnementRepository;
    @Autowired
    private PisteRepository pisteRepository;
    @Autowired
    private IAbonnementService abonnementService;
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