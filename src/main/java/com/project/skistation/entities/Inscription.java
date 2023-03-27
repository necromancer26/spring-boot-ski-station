package com.project.skistation.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
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


}
