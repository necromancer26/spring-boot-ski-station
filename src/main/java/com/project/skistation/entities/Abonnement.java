package com.project.skistation.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Table(name = "abonnements")
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
public class Abonnement implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numAbonnement;
    Date dateDebut;
    Date dateFin;
    float prixAbonnement;
    TypeAbonnement typeAbonnement;

    @Override
    public String toString() {
        return "Abonnement [numAbonnement=" + numAbonnement + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
                + ", prixAbonnement=" + prixAbonnement + ", typeAbonnement=" + typeAbonnement + "]";
    }
    
}