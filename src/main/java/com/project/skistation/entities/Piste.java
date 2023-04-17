package com.project.skistation.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "pistes")
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
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
}
