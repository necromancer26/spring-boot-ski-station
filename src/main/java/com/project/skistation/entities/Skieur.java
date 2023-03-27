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
}
