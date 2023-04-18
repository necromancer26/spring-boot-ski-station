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
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Table(name = "cours")
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
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