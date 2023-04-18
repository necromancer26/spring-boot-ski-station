package com.project.skistation.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;

import com.mysql.cj.log.Log;
import com.project.skistation.entities.Moniteur;
import com.project.skistation.entities.Skieur;
import com.project.skistation.repositories.AbonnementRepository;
import com.project.skistation.repositories.PisteRepository;
import com.project.skistation.repositories.SkieurRepository;
import com.project.skistation.services.IAbonnementService;
import com.project.skistation.services.MoniteurService;
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
    @Autowired
    private SkieurRepository skieurRepository;
    @Autowired
    private MoniteurService moniteurService;

    @Override
    public void run(String... args) throws Exception {
        // create a new Abonnement
        System.out.println("hello inside cli");
        System.out.println("hello");
        // System.out.println("best moniteur is "+moniteurService.besMoniteur().toString());
        // scheduleFixedDelayTask();
    }

    // @Scheduled(fixedDelay = 2000)
    // @Scheduled(cron ="*/10 * * * * *")
    // @Scheduled(cron ="*/10 * * * * ?")
    // public void scheduleFixedDelayTask() {
    // System.out.println(
    // "Fixed delay task - " + System.currentTimeMillis() / 1000);
    // }
    // @Scheduled(cron = "*/10 * * * * ?")
    // @Async
    void retrieveSubscriptions() {
        // List<Skieur> skieurs = skieurRepository.findAll();
        // Skieur skieur = skieurRepository.findById((long) 14).get();

        System.out.println("hello");
        // System.out.println(skieurs.toString());
        // skieurs.forEach(skieur -> System.out.println(skieur.toString()));
    }

}