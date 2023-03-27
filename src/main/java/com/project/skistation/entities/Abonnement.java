package com.project.skistation.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Abonnement implements Serializable{
    @Id
    private long numAbonnement;
    private Date dateDebut;
    private Date dateFin;
    private float prixAbonnement;
    private TypeAbonnement typeAbonnement;

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
}

enum TypeAbonnement {
    ANNUEL, SEMESTRIEL, MENSUEL
}