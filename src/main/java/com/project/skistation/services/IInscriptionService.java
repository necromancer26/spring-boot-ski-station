package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import com.project.skistation.entities.Inscription;

public interface IInscriptionService {

    Inscription saveInscription(Inscription inscription);

    Optional<Inscription> getInscriptionById(long numInscription);

    List<Inscription> getAllInscriptions();

    void deleteInscriptionById(long id);

}