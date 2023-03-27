package com.project.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.skistation.entities.Moniteur;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur,Long>{
    
}
