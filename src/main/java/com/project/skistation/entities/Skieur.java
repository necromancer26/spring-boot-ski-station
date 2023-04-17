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
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Table(name = "skieurs")
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
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

    @Override
    public String toString() {
        return "Skieur [numSkieur=" + numSkieur + ", nomSkieur=" + nomSkieur + ", prenomSkieur=" + prenomSkieur
                + ", dateNaissance=" + dateNaissance + ", ville=" + ville + ", pistes=" + pistes + ", inscriptions="
                + inscriptions + "]";
    }

}
