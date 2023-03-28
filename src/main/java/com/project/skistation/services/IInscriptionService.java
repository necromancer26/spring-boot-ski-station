package com.project.skistation.services;

import java.util.List;

import com.project.skistation.entities.Inscription;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscription();

    Inscription addInscription(Inscription inscription);

    Inscription updateInscription(Inscription inscription);

    Inscription retrieveInscription(Long idInscription);

    void deleteInscription(Long idInscription);
}
