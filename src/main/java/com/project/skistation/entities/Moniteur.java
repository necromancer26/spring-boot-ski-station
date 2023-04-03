package com.project.skistation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "moniteurs")
public class Moniteur implements Serializable{
    public Moniteur(String nomMoniteur, String prenomMoniteur, Set<Cour> cours) {
        this.nomMoniteur = nomMoniteur;
        this.prenomMoniteur = prenomMoniteur;
        this.cours = cours;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numMoniteur;
    private String nomMoniteur;
    private String prenomMoniteur;
    private Date dateRecu;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cour> cours;
    public long getNumMoniteur() {
        return numMoniteur;
    }
    public void setNumMoniteur(long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }
    public String getNomMoniteur() {
        return nomMoniteur;
    }
    public void setNomMoniteur(String nomMoniteur) {
        this.nomMoniteur = nomMoniteur;
    }
    public String getPrenomMoniteur() {
        return prenomMoniteur;
    }
    public void setPrenomMoniteur(String prenomMoniteur) {
        this.prenomMoniteur = prenomMoniteur;
    }
    public Date getDateRecu() {
        return dateRecu;
    }
    public void setDateRecu(Date dateRecu) {
        this.dateRecu = dateRecu;
    }
    public Set<Cour> getCours() {
        return cours;
    }
    public void setCours(Set<Cour> cours) {
        this.cours = cours;
    }
}
