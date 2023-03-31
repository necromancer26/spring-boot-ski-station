package com.project.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.skistation.entities.Skieur;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur,Long>{

}
