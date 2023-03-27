package com.project.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.skistation.entities.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository <Inscription,Long>{
    
}
