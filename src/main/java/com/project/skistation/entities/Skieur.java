package com.project.skistation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "skieurs")
public class Skieur implements Serializable {
    @Id
    private long numSkieur;
    private String nomSkieur;
    private String prenomSkieur;
    private Date dateNaissance;
    private String ville;
    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Inscription> inscriptions;
    @Override
    public String toString() {
        return "Skieur [numSkieur=" + numSkieur + ", nomSkieur=" + nomSkieur + ", prenomSkieur=" + prenomSkieur
                + ", dateNaissance=" + dateNaissance + ", ville=" + ville + ", pistes=" + pistes + ", inscriptions="
                + inscriptions + "]";
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
    public Set<Piste> getPistes() {
        return pistes;
    }
    public void setPistes(Set<Piste> pistes) {
        this.pistes = pistes;
    }
    public Set<Inscription> getInscriptions() {
        return inscriptions;
    }
    public void setInscriptions(Set<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }
}
