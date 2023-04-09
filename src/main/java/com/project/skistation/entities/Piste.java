package com.project.skistation.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;


@Entity
@Table(name = "pistes")
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longeur;
    private int pente;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieurs;
    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;
    
    
    public Piste() {
    }
    public long getNumPiste() {
        return numPiste;
    }
    public void setNumPiste(long numPiste) {
        this.numPiste = numPiste;
    }
    public String getNomPiste() {
        return nomPiste;
    }
    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }
    public Couleur getCouleur() {
        return couleur;
    }
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
    public int getLongeur() {
        return longeur;
    }
    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }
    public int getPente() {
        return pente;
    }
    public void setPente(int pente) {
        this.pente = pente;
    }

    public Set<Skieur> getSkieurs() {
        return skieurs;
    }

    public void setSkieurs(Set<Skieur> skieurs) {
        this.skieurs = skieurs;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }
}
