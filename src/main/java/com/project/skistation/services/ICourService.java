package com.project.skistation.services;

import java.util.List;

import com.project.skistation.entities.Cour;

public interface ICourService {
    List<Cour> retrieveAllCour();

    Cour addCour(Cour cour);

    Cour updateCour(Cour cour);

    Cour retrieveCour(Long idCour);

    void deleteCour(Long idCour);
}
