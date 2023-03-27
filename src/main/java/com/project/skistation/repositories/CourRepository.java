package com.project.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.skistation.entities.Cour;

@Repository
public interface CourRepository extends JpaRepository<Cour, Long> {

}
