package com.project.skistation.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Entity
@Getter
@Setter
@Table(name = "inscriptions")
@FieldDefaults(makeFinal=false, level=AccessLevel.PRIVATE)
public class Inscription implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int numSemaine;
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cour cour;
}
