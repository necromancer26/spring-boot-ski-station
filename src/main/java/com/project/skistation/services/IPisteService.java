package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import com.project.skistation.entities.Piste;

public interface IPisteService {

    Piste savePiste(Piste piste);

    Optional<Piste> getPisteById(long numPiste);

    List<Piste> getAllPistes();

    void deletePisteById(long id);

    public Piste updatePiste(Piste modifiedPiste);

}