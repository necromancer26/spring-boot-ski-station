package com.project.skistation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.skistation.entities.Cour;
import com.project.skistation.repositories.CourRepository;

@Service
public class CourService {
    @Autowired
    private CourRepository courRepository;

    public List<Cour> retrieveAllCours() {
        return courRepository.findAll();
    }

    public Optional<Cour> retrieveCour(Long idCour) {
        return courRepository.findById(idCour);
    }

    public Cour addCour(Cour cour) {
        return courRepository.save(cour);
    }

    public Cour updateCour(Cour cour) {
        return courRepository.save(cour);
    }

    public void deleteCour(Long idCour) {
        courRepository.deleteById(idCour);
    }
}