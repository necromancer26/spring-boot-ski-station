package com.project.skistation.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "abonnements")
public class Abonnement implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbonnement;
    private Date dateDebut;
    private Date dateFin;
    private float prixAbonnement;
    private TypeAbonnement typeAbonnement;

    public Abonnement(){};

    public Abonnement(float prixAbonnement, TypeAbonnement typeAbonnement) {
        this.prixAbonnement = prixAbonnement;
        this.typeAbonnement = typeAbonnement;
        this.dateDebut = new Date();
        this.dateFin= new Date(12);
    }
    public long getNumAbonnement() {
        return numAbonnement;
    }
    public void setNumAbonnement(long numAbonnement) {
        this.numAbonnement = numAbonnement;
    }
    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public float getPrixAbonnement() {
        return prixAbonnement;
    }
    public void setPrixAbonnement(float prixAbonnement) {
        this.prixAbonnement = prixAbonnement;
    }
    public TypeAbonnement getTypeAbonnement() {
        return typeAbonnement;
    }
    public void setTypeAbonnement(TypeAbonnement typeAbonnement) {
        this.typeAbonnement = typeAbonnement;
    }
    @Override
    public String toString() {
        return "Abonnement [numAbonnement=" + numAbonnement + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
                + ", prixAbonnement=" + prixAbonnement + ", typeAbonnement=" + typeAbonnement + "]";
    }
    
}