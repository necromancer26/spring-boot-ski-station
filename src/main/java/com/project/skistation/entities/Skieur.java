package com.project.skistation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "skieurs")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomSkieur;
    private String prenomSkieur;
    private Date dateNaissance;
    private String ville;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Piste> pistes;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;
    @OneToOne
    private Abonnement abonnement;

    public Skieur() {
    }

    public Skieur(String nomSkieur, String prenomSkieur, String ville, List<Piste> pistes,
            List<Inscription> inscriptions, Abonnement abonnement) {
        this.nomSkieur = nomSkieur;
        this.prenomSkieur = prenomSkieur;
        this.ville = ville;
        this.pistes = pistes;
        this.inscriptions = inscriptions;
        this.abonnement = abonnement;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public String getNomSkieur() {
        return nomSkieur;
    }

    public void setNomSkieur(String nomSkieur) {
        this.nomSkieur = nomSkieur;
    }

    public String getPrenomSkieur() {
        return prenomSkieur;
    }

    public void setPrenomSkieur(String prenomSkieur) {
        this.prenomSkieur = prenomSkieur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Piste> getPistes() {
        return pistes;
    }

    public void setPistes(List<Piste> pistes) {
        this.pistes = pistes;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    @Override
    public String toString() {
        return "Skieur [numSkieur=" + numSkieur + ", nomSkieur=" + nomSkieur + ", prenomSkieur=" + prenomSkieur
                + ", dateNaissance=" + dateNaissance + ", ville=" + ville + ", pistes=" + pistes + ", inscriptions="
                + inscriptions + "]";
    }

    public Skieur addSkieurWithAbonnement(Skieur skieur, Abonnement abonnement2) {
        return null;
    }
}
