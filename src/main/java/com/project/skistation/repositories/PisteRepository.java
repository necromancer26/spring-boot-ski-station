package com.project.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.skistation.entities.Piste;

@Repository
public interface PisteRepository extends JpaRepository<Piste,Long>{
    
}
