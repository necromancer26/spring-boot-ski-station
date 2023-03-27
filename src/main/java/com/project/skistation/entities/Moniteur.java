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

@Entity
public class Moniteur implements Serializable{
    @Id
    private long numMoniteur;
    private String nomMoniteur;
    private String prenomMoniteur;
    private Date dateRecu;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cour> cours;
}
