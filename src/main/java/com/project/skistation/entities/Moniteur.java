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
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Table(name = "moniteurs")
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
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
}
