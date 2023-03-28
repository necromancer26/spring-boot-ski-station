package com.project.skistation.entities;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cours")
public class Cour implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private float prix;
    private int creneau;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Inscription> inscriptions;
    public Cour(int niveau, TypeCours typeCours, Support support, float prix, int creneau,
            Set<Inscription> inscriptions) {
        this.niveau = niveau;
        this.typeCours = typeCours;
        this.support = support;
        this.prix = prix;
        this.creneau = creneau;
        this.inscriptions = inscriptions;
    }
    public Cour(long numCours, int niveau, TypeCours typeCours, Support support, float prix, int creneau,
            Set<Inscription> inscriptions) {
        this.numCours = numCours;
        this.niveau = niveau;
        this.typeCours = typeCours;
        this.support = support;
        this.prix = prix;
        this.creneau = creneau;
        this.inscriptions = inscriptions;
    }
    public long getNumCours() {
        return numCours;
    }
    public void setNumCours(long numCours) {
        this.numCours = numCours;
    }
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    public TypeCours getTypeCours() {
        return typeCours;
    }
    public void setTypeCours(TypeCours typeCours) {
        this.typeCours = typeCours;
    }
    public Support getSupport() {
        return support;
    }
    public void setSupport(Support support) {
        this.support = support;
    }
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }
    public int getCreneau() {
        return creneau;
    }
    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }
    public Set<Inscription> getInscriptions() {
        return inscriptions;
    }
    public void setInscriptions(Set<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }
    @Override
    public String toString() {
        return "Cour [numCours=" + numCours + ", niveau=" + niveau + ", typeCours=" + typeCours + ", support=" + support
                + ", prix=" + prix + ", creneau=" + creneau + ", inscriptions=" + inscriptions + "]";
    }

}

enum TypeCours {
    COLLECTIF_ENFANT, COLLECTIF_ADULTE, PARTICULIER
}

enum Support {
    SKI, SNOWBOARD
}