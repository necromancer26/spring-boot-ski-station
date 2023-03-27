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

}

enum TypeCours {
    COLLECTIF_ENFANT, COLLECTIF_ADULTE, PARTICULIER
}

enum Support {
    SKI, SNOWBOARD
}