package com.project.skistation.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "inscriptions")
public class Inscription implements Serializable{
    public Inscription(long numInscription, int numSemaine, Skieur skieur, Cour cour) {
        this.numInscription = numInscription;
        this.numSemaine = numSemaine;
        this.skieur = skieur;
        this.cour = cour;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int numSemaine;
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cour cour;

    public Inscription() {
    }
    public Inscription(int numSemaine, Skieur skieur, Cour cour) {
        this.numSemaine = numSemaine;
        this.skieur = skieur;
        this.cour = cour;
    }
    public long getNumInscription() {
        return numInscription;
    }
    public void setNumInscription(long numInscription) {
        this.numInscription = numInscription;
    }
    public int getNumSemaine() {
        return numSemaine;
    }
    public void setNumSemaine(int numSemaine) {
        this.numSemaine = numSemaine;
    }
    @Override
    public String toString() {
        return "Inscription [numInscription=" + numInscription + ", numSemaine=" + numSemaine + ", skieur=" + skieur
                + ", cour=" + cour + "]";
    }
    public Skieur getSkieur() {
        return skieur;
    }
    public void setSkieur(Skieur skieur) {
        this.skieur = skieur;
    }
    public Cour getCour() {
        return cour;
    }
    public void setCour(Cour cour) {
        this.cour = cour;
    }
    


}
