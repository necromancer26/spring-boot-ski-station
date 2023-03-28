package com.project.skistation.services;

import java.util.List;

import com.project.skistation.entities.Piste;

public interface IPisteService {
    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste piste);

    Piste updatePiste(Piste piste);

    Piste retrievePiste(Long idPiste);

    void deletePiste(Long idPiste);
}
